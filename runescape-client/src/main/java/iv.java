import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("iv")
public class iv extends ho {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bc_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ak_fld;
	// $VF: synthetic field
	@ObfuscatedName("this$0")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	hm this$0;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int am_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte az_fld;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bs_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int an_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	@Override
	void ak(xi var1, int var2) {
		this.ak_fld = var1.ch();
		if (null != this.ak_fld) {
			var1.cg();
			this.ag_fld = xi.rp(var1, 699243610);
			this.az_fld = xi.rp(var1, 1194818027);
		}
	}

	iv(hm var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void az(xi var1) {
		this.ak_fld = var1.ch();
		if (null != this.ak_fld) {
			var1.cg();
			this.ag_fld = xi.rp(var1, -2000012381);
			this.az_fld = xi.rp(var1, 207975166);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void ae(xi var1) {
		this.ak_fld = var1.ch();
		if (null != this.ak_fld) {
			var1.cg();
			this.ag_fld = xi.rp(var1, -829839535);
			this.az_fld = xi.rp(var1, -1908284796);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V"
	)
	@Override
	void ag(ib var1, byte var2) {
		var1.az_fld = this.ak_fld;
		if (null != this.ak_fld) {
			var1.av_fld = this.ag_fld;
			var1.ae_fld = this.az_fld;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxi;)V"
	)
	@Override
	void av(xi var1) {
		this.ak_fld = var1.ch();
		if (null != this.ak_fld) {
			var1.cg();
			this.ag_fld = xi.rp(var1, 312589474);
			this.az_fld = xi.rp(var1, 80861255);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ah(ib var1) {
		var1.az_fld = this.ak_fld;
		if (null != this.ak_fld) {
			var1.av_fld = this.ag_fld;
			var1.ae_fld = this.az_fld;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void aw(ib var1) {
		var1.az_fld = this.ak_fld;
		if (null != this.ak_fld) {
			var1.av_fld = this.ag_fld;
			var1.ae_fld = this.az_fld;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lib;)V"
	)
	@Override
	void ay(ib var1) {
		var1.az_fld = this.ak_fld;
		if (null != this.ak_fld) {
			var1.av_fld = this.ag_fld;
			var1.ae_fld = this.az_fld;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldx;[BIII)V"
	)
	static final void al(dx var0, byte[] var1, int var2, int var3, int var4) throws EOFException {
		try {
			xi var5 = new xi(var1);
			int var6 = -1;

			while (true) {
				int var7 = var5.dm();
				if (var7 == 0) {
					if (var4 <= -1519464882) {
						return;
					}

					return;
				}

				var6 += var7;
				int var8 = 0;

				while (true) {
					int var9 = var5.dz();
					if (0 == var9) {
						break;
					}

					var8 += var9 - 1;
					int var10 = var8 & 63;
					int var11 = var8 >> 6 & 63;
					int var12 = var8 >> 12;
					int var13 = var5.cg();
					int var14 = var13 >> 2;
					int var15 = var13 & 3;
					int var16 = var11 + var2;
					int var17 = var3 + var10;
					if (var16 > 0 && var17 > 0 && var16 < var0.af_fld[0].length - 2) {
						if (var4 <= -1519464882) {
							return;
						}

						if (var17 < var0.af_fld[0][0].length - 2) {
							if (var4 <= -1519464882) {
								return;
							}

							int var18 = var12;
							if (2 == (var0.al_fld[1][var16][var17] & 2)) {
								var18 = var12 - 1;
							}

							gn var19 = null;
							if (var18 >= 0) {
								if (var4 <= -1519464882) {
									return;
								}

								if (var0.av_fld != null) {
									var19 = var0.av_fld[var18];
								}
							}

							un.ax(var0, var12, var16, var17, var6, var15, var14, var19);
						}
					}
				}
			}
		} catch (Throwable var20) {
			throw new RuntimeException(var20);
		}
	}
}
