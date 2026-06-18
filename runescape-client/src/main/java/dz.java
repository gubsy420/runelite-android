import java.io.EOFException;
import javax.annotation.Nullable;
import net.runelite.api.DynamicObject;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements({"DynamicObject"})
public class dz extends em implements DynamicObject {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa ay_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 589749987
	)
	int ah_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1766418471
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 403498857
	)
	int av_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1200111959
	)
	int aw_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static aa aa_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1025273351
	)
	int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ak_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa as_fld;
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev vc_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 901065169
	)
	int ar_fld;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1905215055
	)
	public int kc_fld = -1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int mi_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean fy_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -616039583
	)
	int ae_fld;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)79);
			}

			if (var1 == null) {
				return null;
			} else {
				int var2;
				int var3;
				if (this.av_fld != 1 && 3 != this.av_fld) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = var1.co_fld;
					var3 = var1.cb_fld;
				}

				int var4 = this.ah_fld + (var2 >> 1);
				int var5 = this.ah_fld + (1 + var2 >> 1);
				int var6 = (var3 >> 1) + this.aw_fld;
				int var7 = this.aw_fld + (1 + var3 >> 1);
				int[][] var8 = this.ak_fld.af_fld[this.ae_fld];
				int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
				int var10 = (this.ah_fld << 7) + (var2 << 6);
				int var11 = (this.aw_fld << 7) + (var3 << 6);
				int var12 = client.dv_fld - this.ar_fld;
				this.ar_fld = -1819146721 * client.dv_fld;
				jm.kr_fld.av(this.ak_fld, var10, var11, false);
				int var13 = cf.ak(this.ay_fld, var12, jm.kr_fld);
				jm.kr_fld.ae();
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					qa.gr(this.ay_fld, -747120118);
				}

				if (this.ay_fld.ax(30)) {
					if (qa.jv(this.as_fld, -443383097)) {
						int var14 = cf.ak(this.as_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							qa.gr(this.as_fld, -767501497);
						}

						if (!this.as_fld.ax(30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.as_fld, -1508918831), this.as_fld.aw(-339239848), -2012687314);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.ay_fld, 791754399), this.ay_fld.aw(38288996), -1513332227);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;"
	)
	@Override
	protected final fn az(int var1) {
		try {
			if (!og.ci_fld.isClientThread()) {
				if (!tf.$assertionsDisabled) {
					throw new AssertionError("must be called on client thread");
				} else {
					throw new IllegalStateException("must be called on client thread");
				}
			} else {
				this.oy();
				return this.rt(rl21.ao_fld, this.ay_fld);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public static void wx(pi var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ai_fld = var0.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	@Override
	protected boolean av(byte var1) {
		try {
			oe var2 = ko.az(this.ag_fld);
			if (null != var2.dy_fld) {
				var2 = oe.bm(var2, (byte)111);
			}

			if (null == var2) {
				return false;
			} else if (qa.jv(this.ay_fld, -1038156259) && qa.kw(this.ay_fld, 824994).ar(this.ay_fld.aw(941386604), (byte)38)) {
				return true;
			} else if (qa.jv(this.as_fld, 106842822) && qa.kw(this.as_fld, -875392375).ar(this.as_fld.aw(-210609309), (byte)91)) {
				return true;
			} else {
				fn var3 = var2.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1853358417);
				return null != var3 && null != var3.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("zq")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIII[I)V"
	)
	public static void zq(zv var0, String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.on(var0, var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = var0.hy(var6, var1.length());
			}

			var0.bx(var1, var2, var3, var7, null, null);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		qa var2 = this.ay_fld;
		if (var2 == null) {
			var2 = this.as_fld;
		}

		if (null == var2) {
			return 0;
		} else {
			return qa.jv(var2, -418545317) ? qa.kw(var2, -528032069).bp_fld * 67262061 : 0;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn al() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)53);
			}

			if (var1 == null) {
				return null;
			} else {
				int var2;
				int var3;
				if (this.av_fld != 1 && 3 != this.av_fld) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = var1.co_fld;
					var3 = var1.cb_fld;
				}

				int var4 = this.ah_fld + (var2 >> 1);
				int var5 = this.ah_fld + (1 + var2 >> 1);
				int var6 = (var3 >> 1) + this.aw_fld;
				int var7 = this.aw_fld + (1 + var3 >> 1);
				int[][] var8 = this.ak_fld.af_fld[this.ae_fld];
				int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
				int var10 = (this.ah_fld << 7) + (var2 << 6);
				int var11 = (this.aw_fld << 7) + (var3 << 6);
				int var12 = client.dv_fld - this.ar_fld;
				this.ar_fld = -1819146721 * client.dv_fld;
				jm.kr_fld.av(this.ak_fld, var10, var11, false);
				int var13 = cf.ak(this.ay_fld, var12, jm.kr_fld);
				jm.kr_fld.ae();
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					qa.gr(this.ay_fld, 343332402);
				}

				if (this.ay_fld.ax(30)) {
					if (qa.jv(this.as_fld, 2102980997)) {
						int var14 = cf.ak(this.as_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							qa.gr(this.as_fld, 1039741225);
						}

						if (!this.as_fld.ax(30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.as_fld, -868371805), this.as_fld.aw(-1977044887), -1587092772);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.ay_fld, 602331243), this.ay_fld.aw(-1219975619), -1282242765);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn au() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)55);
			}

			if (var1 == null) {
				return null;
			} else {
				int var2;
				int var3;
				if (this.av_fld != 1 && 3 != this.av_fld) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = var1.co_fld;
					var3 = var1.cb_fld;
				}

				int var4 = this.ah_fld + (var2 >> 1);
				int var5 = this.ah_fld + (1 + var2 >> 1);
				int var6 = (var3 >> 1) + this.aw_fld;
				int var7 = this.aw_fld + (1 + var3 >> 1);
				int[][] var8 = this.ak_fld.af_fld[this.ae_fld];
				int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
				int var10 = (this.ah_fld << 7) + (var2 << 6);
				int var11 = (this.aw_fld << 7) + (var3 << 6);
				int var12 = client.dv_fld - this.ar_fld;
				this.ar_fld = -1819146721 * client.dv_fld;
				jm.kr_fld.av(this.ak_fld, var10, var11, false);
				int var13 = cf.ak(this.ay_fld, var12, jm.kr_fld);
				jm.kr_fld.ae();
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					qa.gr(this.ay_fld, 1331889122);
				}

				if (this.ay_fld.ax(30)) {
					if (qa.jv(this.as_fld, -87694414)) {
						int var14 = cf.ak(this.as_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							qa.gr(this.as_fld, 2062644652);
						}

						if (!this.as_fld.ax(30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.as_fld, 2107276016), this.as_fld.aw(1205014398), -2024091373);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.ay_fld, -1269454593), this.ay_fld.aw(51245604), -1589052516);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lqa;)Lfn;"
	)
	public fn rt(@Nullable rl21 var1, qa var2) {
		try {
			oe var3 = oe.ep(this.ag_fld);
			if (var3.dy_fld != null) {
				var3 = this.co(var3);
			}

			if (var3 == null) {
				return null;
			} else {
				int var4;
				int var5;
				if (this.av_fld != 1 && this.av_fld != 3) {
					var4 = var3.cb_fld;
					var5 = var3.co_fld;
				} else {
					var4 = var3.co_fld;
					var5 = var3.cb_fld;
				}

				int var6 = this.ah_fld + this.vc_fld.qr_fld;
				int var7 = this.aw_fld + this.vc_fld.qr_fld;
				int var8 = (var4 >> 1) + var6;
				int var9 = (var4 + 1 >> 1) + var6;
				int var10 = (var5 >> 1) + var7;
				int var11 = (var5 + 1 >> 1) + var7;
				int[][] var12 = this.vc_fld.cv_fld[this.ae_fld];
				int var13 = var12[var8][var11] + var12[var8][var10] + var12[var9][var10] + var12[var9][var11] >> 2;
				int var14 = (var6 << 7) + (var4 << 6);
				int var15 = (var7 << 7) + (var5 << 6);
				int var16;
				if (client.bz_java_util_function_IntPredicate != null && var2.ag_fld != -1 && client.bz_java_util_function_IntPredicate.test(var2.ag_fld * 163458875)) {
					var16 = -2147483648 | Math.max(var2.av_fld - 1, 0) << 16 | var2.ae_fld;
				} else {
					var16 = var2.ae_fld;
				}

				return var3.na(var1, this.az_fld, this.av_fld, var12, var14, var13, var15, var2.az_fld, var16);
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn ax() {
		try {
			oe var1 = ko.az(this.ag_fld * -600198573);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)95);
			}

			if (var1 == null) {
				return null;
			} else {
				int var2;
				int var3;
				if (this.av_fld != 1 && 3 != this.av_fld) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = 1804452412 * var1.co_fld;
					var3 = var1.cb_fld * -476349319;
				}

				int var4 = this.ah_fld + (var2 >> 1);
				int var5 = this.ah_fld + (1 + var2 >> 1);
				int var6 = (var3 >> 1) + this.aw_fld;
				int var7 = this.aw_fld + (1 + var3 >> 1);
				int[][] var8 = this.ak_fld.af_fld[this.ae_fld];
				int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
				int var10 = (this.ah_fld << 7) + (var2 << 6);
				int var11 = (this.aw_fld << 7) + (var3 << 6);
				int var12 = client.dv_fld - this.ar_fld;
				this.ar_fld = -1819146721 * client.dv_fld;
				jm.kr_fld.av(this.ak_fld, var10, var11, false);
				int var13 = cf.ak(this.ay_fld, var12, jm.kr_fld);
				jm.kr_fld.ae();
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					qa.gr(this.ay_fld, 600282968);
				}

				if (this.ay_fld.ax(30)) {
					if (qa.jv(this.as_fld, 1538306107)) {
						int var14 = cf.ak(this.as_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							qa.gr(this.as_fld, -1142806415);
						}

						if (!this.as_fld.ax(30)) {
							return var1.al(
								this.az_fld * -2110423703, 1412978242 * this.av_fld, var8, var10, var9, var11, qa.kw(this.as_fld, 723268316), this.as_fld.aw(-998058707), -2071840840
							);
						}
					}

					return null;
				} else {
					return var1.al(-1433677422 * this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.ay_fld, -1246503879), this.ay_fld.aw(-556031778), -1770818210);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z"
	)
	public static boolean ag(CharSequence var0) {
		boolean var3 = false;
		boolean var4 = false;
		int var5 = 0;
		int var6 = var0.length();
		int var7 = 0;

		boolean var2;
		while (true) {
			if (var7 >= var6) {
				var2 = var4;
				break;
			}

			label108: {
				char var8 = var0.charAt(var7);
				if (0 == var7) {
					if (var8 == '-') {
						var3 = true;
						break label108;
					}

					if (var8 == '+') {
						break label108;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						var2 = false;
						break;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= 10) {
					var2 = false;
					break;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + 10 * var5;
				if (var9 / 10 != var5) {
					var2 = false;
					break;
				}

				var5 = var9;
				var4 = true;
			}

			var7++;
		}

		return var2;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn da() {
		try {
			return this.rt(null, qa.iw_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("getAnimFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimFrame")
	@Override
	public int getAnimFrame() {
		return this.ay_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void hv() {
		try {
			oe var1 = oe.ep(this.ag_fld);
			if (var1.dy_fld != null) {
				if (var1.di_fld != -1) {
					this.kc_fld = client.tg(var1.di_fld);
					this.mi_fld = rt.ag_fld[this.kc_fld];
				} else if (var1.dn_fld != -1) {
					this.kc_fld = var1.dn_fld;
					this.mi_fld = rt.ag_fld[this.kc_fld];
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)45);
			}

			if (var1 == null) {
				return null;
			} else {
				int var2;
				int var3;
				if (this.av_fld != 1 && 3 != this.av_fld) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = var1.co_fld;
					var3 = var1.cb_fld;
				}

				int var4 = this.ah_fld + (var2 >> 1);
				int var5 = this.ah_fld + (1 + var2 >> 1);
				int var6 = (var3 >> 1) + this.aw_fld;
				int var7 = this.aw_fld + (1 + var3 >> 1);
				int[][] var8 = this.ak_fld.af_fld[this.ae_fld];
				int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
				int var10 = (this.ah_fld << 7) + (var2 << 6);
				int var11 = (this.aw_fld << 7) + (var3 << 6);
				int var12 = client.dv_fld - this.ar_fld;
				this.ar_fld = -1819146721 * client.dv_fld;
				jm.kr_fld.av(this.ak_fld, var10, var11, false);
				int var13 = cf.ak(this.ay_fld, var12, jm.kr_fld);
				jm.kr_fld.ae();
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					qa.gr(this.ay_fld, -1661163341);
				}

				if (this.ay_fld.ax(30)) {
					if (qa.jv(this.as_fld, 210904408)) {
						int var14 = cf.ak(this.as_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							qa.gr(this.as_fld, -1365406576);
						}

						if (!this.as_fld.ax(30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.as_fld, -514332155), this.as_fld.aw(336556562), -1343864289);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, qa.kw(this.ay_fld, -80913203), this.ay_fld.aw(-1484329762), -2077118549);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)55);
			}

			if (null == var1) {
				return false;
			} else if (qa.jv(this.ay_fld, 1119074882) && qa.kw(this.ay_fld, 421222478).ar(this.ay_fld.aw(-1545314879), (byte)76)) {
				return true;
			} else if (qa.jv(this.as_fld, 190798917) && qa.kw(this.as_fld, 83468226).ar(this.as_fld.aw(-277909685), (byte)26)) {
				return true;
			} else {
				fn var2 = var1.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1284239814);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;)Lfn;"
	)
	public fn bx(@Nullable rl21 var1) {
		try {
			return this.rt(var1, this.ay_fld);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "()Loe;"
	)
	public oe getRecordedObjectComposition() {
		try {
			oe var1 = oe.ep(this.ag_fld);
			if (var1.dy_fld != null) {
				var1 = this.co(var1);
			}

			return var1;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol getAnimation() {
		return this.ay_fld.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;"
	)
	static Class av(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return byte.class;
		} else if (var0.equals("I")) {
			return int.class;
		} else if (var0.equals("S")) {
			return short.class;
		} else if (var0.equals("J")) {
			return long.class;
		} else if (var0.equals("Z")) {
			return boolean.class;
		} else if (var0.equals("F")) {
			return float.class;
		} else if (var0.equals("D")) {
			return double.class;
		} else if (var0.equals("C")) {
			return char.class;
		} else {
			return var0.equals("void") ? void.class : Class.forName(var0);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean am() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)64);
			}

			if (null == var1) {
				return false;
			} else if (qa.jv(this.ay_fld, 2053480140) && qa.kw(this.ay_fld, -1544523428).ar(this.ay_fld.aw(-1398482193), (byte)105)) {
				return true;
			} else if (qa.jv(this.as_fld, -264068106) && qa.kw(this.as_fld, -73241891).ar(this.as_fld.aw(1544341278), (byte)46)) {
				return true;
			} else {
				fn var2 = var1.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1234725496);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean gt() {
		return this.ay_fld.az_fld == null;
	}

	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn getModelZbuf() {
		try {
			return this.ay_fld.az_fld != null ? null : this.rt(null, this.ay_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		qa var1 = this.ay_fld;
		if (var1 == null) {
			var1 = this.as_fld;
		}

		if (null == var1) {
			return 0;
		} else {
			return qa.jv(var1, 1087556819) ? qa.kw(var1, -1084489943).bp_fld * 1310696866 : 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad_int() {
		qa var1 = this.ay_fld;
		if (var1 == null) {
			var1 = this.as_fld;
		}

		if (null == var1) {
			return 0;
		} else {
			return qa.jv(var1, 1749189229) ? qa.kw(var1, -872978482).bp_fld * 353791578 : 0;
		}
	}

	dz(dx var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, em var10) throws EOFException {
		this.vc_fld = var1.az_fld;
		if (var10 instanceof dz) {
			this.kc_fld = ((dz)var10).kc_fld;
			this.mi_fld = ((dz)var10).mi_fld;
		}

		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
		this.aw_fld = var7;
		this.ay_fld = new qa();
		this.as_fld = new qa();
		if (-1 != var8) {
			qa.hs(this.ay_fld, var8, 73968166);
			qa.hs(this.as_fld, var8, 1362111214);
			ol var11 = qa.kw(this.ay_fld, 1521606475);
			this.ar_fld = client.dv_fld - 1360252721;
			if (var9 && var11.bl_fld != -1) {
				this.ay_fld.aq();
			}

			if (var10 instanceof dz) {
				dz var12 = (dz)var10;
				if (qa.ps(var12.ay_fld, (byte)-10) == var8) {
					if (0 == var11.ba_fld) {
						this.ay_fld.ak(var12.ay_fld);
						this.ar_fld = var12.ar_fld * 901065169;
					}

					this.as_fld.ak(var12.as_fld);
				} else if (!var12.ay_fld.an()) {
					this.as_fld.ak(var12.as_fld);
				} else {
					this.as_fld.ak(var12.ay_fld);
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsd;"
	)
	static sd az(int var0, byte var1) {
		sd var2 = (sd)ka.ak(lt.ak(), var0);
		if (null == var2) {
			var2 = sd.ak_fld;
		}

		return var2;
	}

	@ObfuscatedName("getAnimCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getAnimCycle")
	@Override
	public int getAnimCycle() {
		return -1;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void oy() {
		try {
			oe var1 = oe.ep(this.ag_fld);
			if (var1.dy_fld != null) {
				var1 = this.co(var1);
			}

			if (var1 != null) {
				int var2;
				int var3;
				if (this.av_fld != 1 && this.av_fld != 3) {
					var2 = var1.cb_fld;
					var3 = var1.co_fld;
				} else {
					var2 = var1.co_fld;
					var3 = var1.cb_fld;
				}

				int var4 = (this.ah_fld << 7) + (var2 << 6);
				int var5 = (this.aw_fld << 7) + (var3 << 6);
				int var6 = client.dv_fld - this.ar_fld;
				this.ar_fld = client.dv_fld;
				jm.kr_fld.yj(this.ak_fld, var4, var5, false);
				int var7 = ol.fi(this.ay_fld, var6, jm.kr_fld);
				jm.kr_fld.ed();
				if ((var7 & 1) != 0 && (var7 & 8) != 0) {
					this.ay_fld.oo();
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Loe;)Loe;"
	)
	public oe co(oe var1) {
		try {
			if (this.kc_fld == -1) {
				return null;
			} else {
				int var2 = -1;
				if (var1.di_fld != -1) {
					var2 = client.hz(var1.di_fld, this.mi_fld);
				} else if (var1.dn_fld != -1) {
					var2 = this.mi_fld;
				}

				int var3;
				if (var2 >= 0 && var2 < var1.dy_fld.length - 1) {
					var3 = var1.dy_fld[var2];
				} else {
					var3 = var1.dy_fld[var1.dy_fld.length - 1];
				}

				return var3 != -1 ? oe.ep(var3) : null;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			oe var1 = ko.az(-357695188 * this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = oe.bm(var1, (byte)55);
			}

			if (null == var1) {
				return false;
			} else if (qa.jv(this.ay_fld, 1568106118) && qa.kw(this.ay_fld, -1757658901).ar(this.ay_fld.aw(371502305), (byte)14)) {
				return true;
			} else if (qa.jv(this.as_fld, 883246558) && qa.kw(this.as_fld, -1689698764).ar(this.as_fld.aw(609153803), (byte)117)) {
				return true;
			} else {
				fn var2 = var1.al(274186705 * this.az_fld, this.av_fld * -1058821726, null, 0, 0, 0, null, -1, -873416261);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}
}
