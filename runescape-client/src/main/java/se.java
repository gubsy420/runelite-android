import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("se")
public class se implements xm {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se az_fld = new se(2, 2, null, 3);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se ag_fld = new se(1, 1, null, 9);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se ak_fld = new se(0, 0, null, 0);
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1469985043
	)
	static int bi_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se ae_fld = new se(4, 4, null, 1);
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ao_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1111452169
	)
	int aw_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -2055513329
	)
	int ay_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1325068223
	)
	int as_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se av_fld = new se(3, 3, null, 6);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static se ah_fld = new se(5, 5, null, 3);
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int br_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	public static int qn(li var0) {
		return var0.bd_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ay_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ak() {
		return this.as_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ay_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ay_fld;
	}

	se(int var1, int var2, String var3, int var4) {
		this.aw_fld = var1;
		this.ay_fld = var2;
		this.as_fld = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ay_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int az() {
		return this.as_fld;
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int ot(es var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return es.dl(var0, (rr)var1, (rr)var2, (byte)-58);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int aw() {
		return this.as_fld;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V"
	)
	static final void ar(int var0, int var1, int var2, int var3, int var4, int var5) throws EOFException {
		ev var6 = bw.dk_fld.az_fld;
		long var7 = var6.cd(var0, var1, var2);
		if (var7 != 0L) {
			if (var5 != 2094148658) {
				return;
			}

			int var9 = var6.cx(var0, var1, var2, var7);
			int var10 = var9 >> 6 & 3;
			int var11 = var9 & 31;
			int var12 = var3;
			if (jv.az(var7)) {
				var12 = var4;
			}

			int[] var13 = bx.aw_fld.ah_fld;
			int var14 = (103 - var2) * 2048 + 24624 + 4 * var1;
			int var15 = bj.ae(var7);
			oe var16 = ko.az(var15);
			if (var16.dq_fld != -1) {
				yc var17 = pf.ax_fld[var16.dq_fld];
				if (var17 != null) {
					int var18 = (var16.cb_fld - var17.az_fld) / 2;
					int var19 = (var16.co_fld - var17.av_fld) / 2;
					var17.ae(var18 + var1 * 4 + 48, 48 + 4 * (104 - var2 - var16.co_fld) + var19);
				}
			} else {
				if (var11 == 0 || 2 == var11) {
					if (0 == var10) {
						var13[var14] = var12;
						var13[512 + var14] = var12;
						var13[1024 + var14] = var12;
						var13[1536 + var14] = var12;
					} else if (1 == var10) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14] = var12;
						var13[var14 + 1] = var12;
						var13[2 + var14] = var12;
						var13[3 + var14] = var12;
					} else if (2 == var10) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14 + 3] = var12;
						var13[512 + 3 + var14] = var12;
						var13[3 + var14 + 1024] = var12;
						var13[1536 + 3 + var14] = var12;
					} else if (3 == var10) {
						var13[var14 + 1536] = var12;
						var13[1 + 1536 + var14] = var12;
						var13[var14 + 1536 + 2] = var12;
						var13[var14 + 1536 + 3] = var12;
					}
				}

				if (var11 == 3) {
					if (var5 != 2094148658) {
						return;
					}

					if (var10 == 0) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14] = var12;
					} else if (1 == var10) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14 + 3] = var12;
					} else if (2 == var10) {
						var13[3 + var14 + 1536] = var12;
					} else if (3 == var10) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14 + 1536] = var12;
					}
				}

				if (var11 == 2) {
					if (var10 == 3) {
						var13[var14] = var12;
						var13[512 + var14] = var12;
						var13[var14 + 1024] = var12;
						var13[var14 + 1536] = var12;
					} else if (0 == var10) {
						var13[var14] = var12;
						var13[1 + var14] = var12;
						var13[var14 + 2] = var12;
						var13[3 + var14] = var12;
					} else if (var10 == 1) {
						if (var5 != 2094148658) {
							return;
						}

						var13[var14 + 3] = var12;
						var13[512 + var14 + 3] = var12;
						var13[3 + var14 + 1024] = var12;
						var13[1536 + 3 + var14] = var12;
					} else if (2 == var10) {
						if (var5 != 2094148658) {
							return;
						}

						var13[1536 + var14] = var12;
						var13[1536 + var14 + 1] = var12;
						var13[2 + var14 + 1536] = var12;
						var13[3 + var14 + 1536] = var12;
					}
				}
			}
		}

		var7 = var6.cq(var0, var1, var2);
		if (var7 != 0L) {
			int var22 = var6.cx(var0, var1, var2, var7);
			int var24 = var22 >> 6 & 3;
			int var26 = var22 & 31;
			int var28 = bj.ae(var7);
			oe var30 = ko.az(var28);
			if (-1 != var30.dq_fld) {
				yc var32 = pf.ax_fld[var30.dq_fld];
				if (null != var32) {
					int var34 = (var30.cb_fld - var32.az_fld) / 2;
					int var36 = (var30.co_fld - var32.av_fld) / 2;
					var32.ae(48 + var1 * 4 + var34, 4 * (104 - var2 - var30.co_fld) + 48 + var36);
				}
			} else if (var26 == 9) {
				int var33 = 15658734;
				if (jv.az(var7)) {
					if (var5 != 2094148658) {
						return;
					}

					var33 = 15597568;
				}

				int[] var35 = bx.aw_fld.ah_fld;
				int var37 = 24624 + 4 * var1 + (103 - var2) * 2048;
				if (var24 != 0 && 2 != var24) {
					var35[var37] = var33;
					var35[512 + var37 + 1] = var33;
					var35[1024 + var37 + 2] = var33;
					var35[3 + var37 + 1536] = var33;
				} else {
					var35[1536 + var37] = var33;
					var35[1 + var37 + 1024] = var33;
					var35[2 + 512 + var37] = var33;
					var35[3 + var37] = var33;
				}
			}
		}

		var7 = var6.cv(var0, var1, var2);
		if (0L != var7) {
			int var23 = bj.ae(var7);
			oe var25 = ko.az(var23);
			if (-1 != var25.dq_fld) {
				yc var27 = pf.ax_fld[var25.dq_fld];
				if (null != var27) {
					int var29 = (var25.cb_fld - var27.az_fld) / 2;
					int var31 = (var25.co_fld - var27.av_fld) / 2;
					var27.ae(4 * var1 + 48 + var29, var31 + 4 * (104 - var2 - var25.co_fld) + 48);
				}
			}
		}
	}
}
