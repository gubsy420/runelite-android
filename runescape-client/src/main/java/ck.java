import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ck")
public class ck extends dr {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ck_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	ds ak_fld;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ai() {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	void ak(int var1) {
		try {
			if (null == this.ak_fld) {
				if (var1 != -996111700) {
					;
				}
			} else if (this.ak_fld.ah_fld == null) {
				this.bm(-1117391115);
			} else if (null != this.ak_fld.ah_fld.dy_fld) {
				pp var2 = this.ak_fld.ah_fld.ar((byte)6);
				if (null == var2) {
					this.ax_fld = true;
				} else {
					int var3 = 1077344343 * this.ar_fld.ag_fld;
					dr.xf(this, var2.ei_fld, var2.ee_fld, -1937441824);
					if (var3 != this.ar_fld.ag_fld * 1077344343) {
						if (var1 == -996111700) {
							return;
						}

						this.ax_fld = true;
					}
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ag(int var1) {
		return this.ak_fld.bo_fld * -1254596105;
	}

	ck(ds var1) throws EOFException {
		super(var1.ak(-1673494455), var1.ah_fld.ei_fld, var1.ah_fld.ee_fld);
		this.ak_fld = var1;
		if (null != var1.ah_fld.dy_fld) {
			pp var2 = var1.ah_fld.ar((byte)6);
			if (null != var2) {
				dr.xf(this, var2.ei_fld, var2.ee_fld, -1937441824);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	@Override
	int av(byte var1) {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int am() {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	void ah() {
		try {
			if (null != this.ak_fld) {
				if (this.ak_fld.ah_fld == null) {
					this.bm(-989052079);
				} else if (null != this.ak_fld.ah_fld.dy_fld) {
					pp var1 = this.ak_fld.ah_fld.ar((byte)6);
					if (null == var1) {
						this.ax_fld = true;
					} else {
						int var2 = 1077344343 * this.ar_fld.ag_fld;
						dr.xf(this, var1.ei_fld, var1.ee_fld, -1937441824);
						if (var2 != this.ar_fld.ag_fld * 1077344343) {
							this.ax_fld = true;
						}
					}
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	@Override
	void aw() {
		try {
			if (null != this.ak_fld) {
				if (this.ak_fld.ah_fld == null) {
					this.bm(-464071440);
				} else if (null != this.ak_fld.ah_fld.dy_fld) {
					pp var1 = this.ak_fld.ah_fld.ar((byte)6);
					if (null == var1) {
						this.ax_fld = true;
					} else {
						int var2 = 1077344343 * this.ar_fld.ag_fld;
						dr.xf(this, var1.ei_fld, var1.ee_fld, -1937441824);
						if (var2 != this.ar_fld.ag_fld * 1077344343) {
							this.ax_fld = true;
						}
					}
				}
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int ae(int var1) {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int as() {
		return this.ak_fld.bo_fld * -1254596105;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ar() {
		return this.ak_fld.bo_fld * -1254596105;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int af() {
		return this.ak_fld.bo_fld * -1254596105;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int al() {
		return this.ak_fld.bo_fld * -317542311;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int au() {
		return this.ak_fld.bo_fld * -1453489211;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ax() {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int an() {
		return -84459444 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int aq() {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int ay() {
		return this.ak_fld.bo_fld * -1818112678;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	int az(int var1) {
		return this.ak_fld.bo_fld * -1254596105;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	int aa() {
		return -1009984759 * this.ak_fld.bp_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldx;Lxi;IIIIIII)V"
	)
	static final void aw(dx var0, xi var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[][][] var9 = var0.af_fld;
		byte[][][] var10 = var0.al_fld;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var9[0].length - 1 && var4 >= 0 && var4 < var9[0][0].length - 1) {
			var10[var2][var3][var4] = 0;

			while (true) {
				int var11 = xi.tx(var1, 1675093771);
				if (var11 == 0) {
					if (0 == var2) {
						if (var8 <= -116346001) {
							return;
						}

						var9[0][var3][var4] = -cj.aa(var5 + 932731, var6 + 556238) * 8;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (1 == var11) {
					int var12 = var1.cg();
					if (var12 == 1) {
						var12 = 0;
					}

					if (var2 == 0) {
						var9[0][var3][var4] = 8 * -var12;
					} else {
						var9[var2][var3][var4] = var9[var2 - 1][var3][var4] - var12 * 8;
					}
					break;
				}

				if (var11 <= 49) {
					tx.al_fld[var2][var3][var4] = (short)var1.cz();
					rt.au_fld[var2][var3][var4] = (byte)((var11 - 2) / 4);
					us.ax_fld[var2][var3][var4] = (byte)(var11 - 2 + var7 & 3);
				} else if (var11 <= 81) {
					var10[var2][var3][var4] = (byte)(var11 - 49);
				} else {
					cq.af_fld[var2][var3][var4] = (short)(var11 - 81);
				}
			}
		} else {
			bc.ay(var1, (byte)-5);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;II)[Lyc;"
	)
	public static yc[] ak(ub var0, int var1, int var2) throws EOFException {
		try {
			if (!ms.ar(var0, var1, var2)) {
				return null;
			} else {
				yc[] var5 = new yc[yh.ak_fld];

				for (int var6 = 0; var6 < yh.ak_fld; var6++) {
					yc var7 = var5[var6] = new yc();
					var7.aw_fld = yh.ag_fld;
					var7.ay_fld = yh.az_fld;
					var7.ae_fld = yh.av_fld[var6];
					var7.ah_fld = yh.ae_fld[var6];
					var7.az_fld = yh.ah_fld[var6];
					var7.av_fld = yh.aw_fld[var6];
					var7.ag_fld = yh.ay_fld;
					var7.ak_fld = yo.as_fld[var6];
				}

				jl.au();
				return var5;
			}
		} catch (Throwable var8) {
			throw new RuntimeException(var8);
		}
	}
}
