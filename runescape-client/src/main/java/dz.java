import java.io.EOFException;
import javax.annotation.Nullable;
import net.runelite.api.DynamicObject;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements({"DynamicObject"})
public class dz extends em implements DynamicObject {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa as_fld;
	@ObfuscatedGetter(
		intValue = 589749987
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedGetter(
		intValue = 1766418471
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;
	@ObfuscatedGetter(
		intValue = 403498857
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
	@ObfuscatedGetter(
		intValue = 1200111959
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static aa aa_fld;
	@ObfuscatedGetter(
		intValue = -1025273351
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("za")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int za_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	dx ak_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	qa ay_fld;
	@ObfuscatedGetter(
		intValue = 901065169
	)
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ar_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int af_fld;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	public ev ja_fld;
	@ObfuscatedGetter(
		intValue = 1905215055
	)
	@ObfuscatedName("zs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int zs_fld = -1;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ga_fld;
	@ObfuscatedGetter(
		intValue = -616039583
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn il() {
		try {
			return this.om(null, qa.pm_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn an() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = var1.ax((byte)79);
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
				int var13 = cf.ak(this.as_fld, var12, jm.kr_fld);
				jm.kr_fld.ae(1835755257);
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					this.as_fld.ag();
				}

				if (qa.jo(this.as_fld, 30)) {
					if (this.ay_fld.av()) {
						int var14 = cf.ak(this.ay_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							this.ay_fld.ag();
						}

						if (!qa.jo(this.ay_fld, 30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.ay_fld.ae(), qa.do_(this.ay_fld, -339239848), -2012687314);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.as_fld.ae(), qa.do_(this.as_fld, 38288996), -1513332227);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Loe;)Loe;"
	)
	public oe jm(oe var1) {
		try {
			if (this.zs_fld == -1) {
				return null;
			} else {
				int var2 = -1;
				if (var1.di_fld != -1) {
					var2 = client.hj(var1.di_fld, this.za_fld);
				} else if (var1.dn_fld != -1) {
					var2 = this.za_fld;
				}

				int var3;
				if (var2 >= 0 && var2 < var1.dy_fld.length - 1) {
					var3 = var1.dy_fld[var2];
				} else {
					var3 = var1.dy_fld[var1.dy_fld.length - 1];
				}

				return var3 != -1 ? oe.ke(var3) : null;
			}
		} catch (Throwable var5) {
			throw new RuntimeException(var5);
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;Lqa;)Lfn;"
	)
	public fn om(@Nullable rl21 var1, qa var2) {
		try {
			oe var3 = oe.ke(this.ag_fld);
			if (var3.dy_fld != null) {
				var3 = this.jm(var3);
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

				int var6 = this.ah_fld + this.ja_fld.jh_fld;
				int var7 = this.aw_fld + this.ja_fld.jh_fld;
				int var8 = (var4 >> 1) + var6;
				int var9 = (var4 + 1 >> 1) + var6;
				int var10 = (var5 >> 1) + var7;
				int var11 = (var5 + 1 >> 1) + var7;
				int[][] var12 = this.ja_fld.cs_fld[this.ae_fld];
				int var13 = var12[var8][var11] + var12[var8][var10] + var12[var9][var10] + var12[var9][var11] >> 2;
				int var14 = (var6 << 7) + (var4 << 6);
				int var15 = (var7 << 7) + (var5 << 6);
				int var16;
				if (client.xg_fld != null && var2.ag_fld != -1 && client.xg_fld.test(var2.ag_fld * 163458875)) {
					var16 = -2147483648 | Math.max(var2.av_fld - 1, 0) << 16 | var2.ae_fld;
				} else {
					var16 = var2.ae_fld;
				}

				return var3.ry(var1, this.az_fld, this.av_fld, var12, var14, var13, var15, var2.az_fld, var16);
			}
		} catch (Throwable var18) {
			throw new RuntimeException(var18);
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "()Lol;"
	)
	public ol getAnimation() {
		return this.as_fld.az_fld;
	}

	@ObfuscatedName("getAnimFrame")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimFrame() {
		return this.as_fld.ae_fld * 249909987;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "()Loe;"
	)
	public oe getRecordedObjectComposition() {
		try {
			oe var1 = oe.ke(this.ag_fld);
			if (var1.dy_fld != null) {
				var1 = this.jm(var1);
			}

			return var1;
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(Lrl21;)Lfn;"
	)
	public fn qr(@Nullable rl21 var1) {
		try {
			return this.om(var1, this.as_fld);
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
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
				this.uf();
				return this.om(rl21.no_fld, this.as_fld);
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void iv() {
		try {
			oe var1 = oe.ke(this.ag_fld);
			if (var1.dy_fld != null) {
				if (var1.di_fld != -1) {
					this.zs_fld = client.ik(var1.di_fld);
					this.za_fld = rt.ag_fld[this.zs_fld];
				} else if (var1.dn_fld != -1) {
					this.zs_fld = var1.dn_fld;
					this.za_fld = rt.ag_fld[this.zs_fld];
				}
			}
		} catch (Throwable var3) {
			throw new RuntimeException(var3);
		}
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
				var2 = var2.ax((byte)111);
			}

			if (null == var2) {
				return false;
			} else if (this.as_fld.av() && this.as_fld.ae().ar(qa.do_(this.as_fld, 941386604), (byte)38)) {
				return true;
			} else if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, -210609309), (byte)91)) {
				return true;
			} else {
				fn var3 = var2.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1853358417);
				return null != var3 && null != var3.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	protected int ae(byte var1) {
		qa var2 = this.as_fld;
		if (var2 == null) {
			var2 = this.ay_fld;
		}

		if (null == var2) {
			return 0;
		} else {
			return var2.av() ? var2.ae().bp_fld * 67262061 : 0;
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
				var1 = var1.ax((byte)53);
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
				int var13 = cf.ak(this.as_fld, var12, jm.kr_fld);
				jm.kr_fld.ae(1876627274);
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					this.as_fld.ag();
				}

				if (qa.jo(this.as_fld, 30)) {
					if (this.ay_fld.av()) {
						int var14 = cf.ak(this.ay_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							this.ay_fld.ag();
						}

						if (!qa.jo(this.ay_fld, 30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.ay_fld.ae(), qa.do_(this.ay_fld, -1977044887), -1587092772);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.as_fld.ae(), qa.do_(this.as_fld, -1219975619), -1282242765);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("getAnimCycle")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getAnimCycle() {
		return -1;
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
				var1 = var1.ax((byte)55);
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
				int var13 = cf.ak(this.as_fld, var12, jm.kr_fld);
				jm.kr_fld.ae(1952041232);
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					this.as_fld.ag();
				}

				if (qa.jo(this.as_fld, 30)) {
					if (this.ay_fld.av()) {
						int var14 = cf.ak(this.ay_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							this.ay_fld.ag();
						}

						if (!qa.jo(this.ay_fld, 30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.ay_fld.ae(), qa.do_(this.ay_fld, 1205014398), -2024091373);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.as_fld.ae(), qa.do_(this.as_fld, 51245604), -1589052516);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
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
				var1 = var1.ax((byte)95);
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
				int var13 = cf.ak(this.as_fld, var12, jm.kr_fld);
				jm.kr_fld.ae(2048112139);
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					this.as_fld.ag();
				}

				if (qa.jo(this.as_fld, 30)) {
					if (this.ay_fld.av()) {
						int var14 = cf.ak(this.ay_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							this.ay_fld.ag();
						}

						if (!qa.jo(this.ay_fld, 30)) {
							return var1.al(
								this.az_fld * -2110423703, 1412978242 * this.av_fld, var8, var10, var9, var11, this.ay_fld.ae(), qa.do_(this.ay_fld, -998058707), -2071840840
							);
						}
					}

					return null;
				} else {
					return var1.al(-1433677422 * this.az_fld, this.av_fld, var8, var10, var9, var11, this.as_fld.ae(), qa.do_(this.as_fld, -556031778), -1770818210);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;)Z"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	@Override
	protected final fn aa() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = var1.ax((byte)45);
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
				int var13 = cf.ak(this.as_fld, var12, jm.kr_fld);
				jm.kr_fld.ae(1910427434);
				if (0 != (var13 & 1) && (var13 & 8) != 0) {
					this.as_fld.ag();
				}

				if (qa.jo(this.as_fld, 30)) {
					if (this.ay_fld.av()) {
						int var14 = cf.ak(this.ay_fld, var12, null);
						if (0 != (var14 & 1) && 0 != (var14 & 8)) {
							this.ay_fld.ag();
						}

						if (!qa.jo(this.ay_fld, 30)) {
							return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.ay_fld.ae(), qa.do_(this.ay_fld, 336556562), -1343864289);
						}
					}

					return null;
				} else {
					return var1.al(this.az_fld, this.av_fld, var8, var10, var9, var11, this.as_fld.ae(), qa.do_(this.as_fld, -1484329762), -2077118549);
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void uf() {
		try {
			oe var1 = oe.ke(this.ag_fld);
			if (var1.dy_fld != null) {
				var1 = this.jm(var1);
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
				jm.kr_fld.na(this.ak_fld, var4, var5, false);
				int var7 = ol.yb(this.as_fld, var6, jm.kr_fld);
				jm.kr_fld.gn();
				if ((var7 & 1) != 0 && (var7 & 8) != 0) {
					this.as_fld.cp();
				}
			}
		} catch (Throwable var9) {
			throw new RuntimeException(var9);
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
				var1 = var1.ax((byte)55);
			}

			if (null == var1) {
				return false;
			} else if (this.as_fld.av() && this.as_fld.ae().ar(qa.do_(this.as_fld, -1545314879), (byte)76)) {
				return true;
			} else if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, -277909685), (byte)26)) {
				return true;
			} else {
				fn var2 = var1.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1284239814);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
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

	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "(Luf;II)V"
	)
	public static void rx(uf var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.av_fld = var1;
			var0.ae_fld = var2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean aq() {
		try {
			oe var1 = ko.az(this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = var1.ax((byte)64);
			}

			if (null == var1) {
				return false;
			} else if (this.as_fld.av() && this.as_fld.ae().ar(qa.do_(this.as_fld, -1398482193), (byte)105)) {
				return true;
			} else if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, 1544341278), (byte)46)) {
				return true;
			} else {
				fn var2 = var1.al(this.az_fld, this.av_fld, null, 0, 0, 0, null, -1, -1234725496);
				return null != var2 && null != var2.cv_fld;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	public boolean qc() {
		return this.as_fld.az_fld == null;
	}

	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "()Lfn;"
	)
	public fn getModelZbuf() {
		try {
			return this.as_fld.az_fld != null ? null : this.om(null, this.as_fld);
		} catch (Throwable var2) {
			throw new RuntimeException(var2);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ad() {
		qa var1 = this.as_fld;
		if (var1 == null) {
			var1 = this.ay_fld;
		}

		if (null == var1) {
			return 0;
		} else {
			return var1.av() ? var1.ae().bp_fld * 1310696866 : 0;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	protected int ao() {
		qa var1 = this.as_fld;
		if (var1 == null) {
			var1 = this.ay_fld;
		}

		if (null == var1) {
			return 0;
		} else {
			return var1.av() ? var1.ae().bp_fld * 353791578 : 0;
		}
	}

	dz(dx var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, em var10) throws EOFException {
		this.ja_fld = var1.az_fld;
		if (var10 instanceof dz) {
			this.zs_fld = ((dz)var10).zs_fld;
			this.za_fld = ((dz)var10).za_fld;
		}

		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
		this.ae_fld = var5;
		this.ah_fld = var6;
		this.aw_fld = var7;
		this.as_fld = new qa();
		this.ay_fld = new qa();
		if (-1 != var8) {
			qa.ju(this.as_fld, var8, 73968166);
			qa.ju(this.ay_fld, var8, 1362111214);
			ol var11 = this.as_fld.ae();
			this.ar_fld = client.dv_fld - 1360252721;
			if (var9 && var11.bl_fld != -1) {
				this.as_fld.aq(1764590828);
			}

			if (var10 instanceof dz) {
				dz var12 = (dz)var10;
				if (var12.as_fld.ah() == var8) {
					if (0 == var11.ba_fld) {
						this.as_fld.ak(var12.as_fld);
						this.ar_fld = var12.ar_fld * 901065169;
					}

					this.ay_fld.ak(var12.ay_fld);
				} else if (!qa.uq(var12.as_fld, 800942829)) {
					this.ay_fld.ak(var12.ay_fld);
				} else {
					this.ay_fld.ak(var12.as_fld);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	protected boolean ai() {
		try {
			oe var1 = ko.az(-357695188 * this.ag_fld);
			if (null != var1.dy_fld) {
				var1 = var1.ax((byte)55);
			}

			if (null == var1) {
				return false;
			} else if (this.as_fld.av() && this.as_fld.ae().ar(qa.do_(this.as_fld, 371502305), (byte)14)) {
				return true;
			} else if (this.ay_fld.av() && this.ay_fld.ae().ar(qa.do_(this.ay_fld, 609153803), (byte)117)) {
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
