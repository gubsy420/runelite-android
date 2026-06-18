import java.io.EOFException;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;
import net.runelite.api.widgets.WidgetConfigNode;

@ObfuscatedName("lg")
@Implements({"WidgetConfigNode"})
public class lg extends vw implements WidgetConfigNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 272571727
	)
	int av_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1666372233
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1428995369
	)
	int az_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	public lg ae_fld;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int bt_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 233761761
	)
	public int ak_fld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int au_fld;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lrg;Lda;I)Z"
	)
	static boolean cb(rg var0, da var1) {
		if (var0 != null && var1 != null) {
			int var3 = -1693769408 * var1.bn_fld;
			int var4 = var1.bi_fld - var3;
			int var5 = var1.dm_fld - var3;
			int var6 = var1.bi_fld + var3 - 1;
			int var7 = var1.dm_fld + var3 - 1;
			vv var8;
			synchronized (vv.ah_fld) {
				if (0 == vv.ay_fld) {
					var8 = new vv();
				} else {
					vv.ey(vv.ah_fld[(vv.ay_fld -= -235759801) * -2124815753], -843994495);
					var8 = vv.ah_fld[vv.ay_fld];
				}
			}

			vv.cn(var8, var0.aw_fld.al(1755258691), var0.dp(-727594710), var0.dj(189745805), rg.es(var0, 1650531664), (short)8226);
			boolean var10;
			if (!ok.ae(var8, var4, var5, var6, var7)) {
				var10 = false;
			} else {
				int var12 = vv.ja(var8, 0, (byte)4);
				int var13 = var8.av(0);
				int var14 = vv.ja(var8, 1, (byte)4);
				int var15 = var8.av(1);
				int var16 = vv.ja(var8, 2, (byte)4);
				int var17 = var8.av(2);
				int var18 = vv.ja(var8, 3, (byte)4);
				int var19 = var8.av(3);
				int var20 = var4 + 1;
				int var21 = var5 + 1;
				int var22 = var6 - 1;
				int var23 = var7 - 1;
				boolean var11;
				if (var12 >= var20 && var12 <= var22 && var13 >= var21 && var13 <= var23) {
					var11 = true;
				} else if (var14 >= var20 && var14 <= var22 && var15 >= var21 && var15 <= var23) {
					var11 = true;
				} else if (var16 >= var20 && var16 <= var22 && var17 >= var21 && var17 <= var23) {
					var11 = true;
				} else if (var18 >= var20 && var18 <= var22 && var19 >= var21 && var19 <= var23) {
					var11 = true;
				} else if (jw.ak(var20, var21, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var20, var23, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var22, var21, var12, var13, var14, var15, var16, var17)
					|| jw.ak(var22, var23, var12, var13, var14, var15, var16, var17)) {
					var11 = true;
				} else if (!sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22, var21)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var22, var21, var22, var23)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var22, var23, var20, var23)
					&& !sq.ak(var12, var13, var14, var15, var16, var17, var18, var19, var20, var23, var20, var21)) {
					var11 = false;
				} else {
					var11 = true;
				}

				var10 = var11;
			}

			var8.ak();
			return var10;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.av_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int av() {
		return this.az_fld;
	}

	@ObfuscatedName("getClickMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getClickMask")
	@Override
	public int getClickMask() {
		return this.az_fld;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aw() {
		return this.av_fld;
	}

	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "(Llg;)I"
	)
	public static int rs(lg var0) {
		return var0.az_fld;
	}

	lg(int var1, int var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Llg;)I"
	)
	public static int ia(lg var0) {
		return var0.az_fld;
	}

	@ObfuscatedName("getOpMask")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getOpMask")
	@Override
	public int getOpMask() {
		return this.av_fld;
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)I"
	)
	public static int lq(lg var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.az_fld;
	}

	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "(Lqa;)I"
	)
	public static int te(qa var0) {
		return var0.aw_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIII)Llg;"
	)
	public static lg as(lg var0, int var1, int var2, int var3, int var4) {
		lg var5 = var0;

		for (lg var6 = null; var5 != null; var5 = var5.ae_fld) {
			if (var5.ag_fld >= var1 && var5.ak_fld <= var2) {
				if (var6 != null) {
					var6.ae_fld = var5.ae_fld;
				} else {
					var0 = var5.ae_fld;
				}

				if (var5.ak_fld < var1) {
					lg var7 = new lg(-494194735 * var5.ak_fld, var1 - 1, var5.az_fld, 1703873415 * var5.av_fld);
					if (null != var6) {
						var7.ae_fld = var6.ae_fld;
					} else {
						var7.ae_fld = var0;
					}

					if (null != var6) {
						var6.ae_fld = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.ag_fld > var2) {
					lg var11 = new lg(1 + var2, -1597529789 * var5.ag_fld, var5.az_fld, var5.av_fld * -93858024);
					if (null != var6) {
						var11.ae_fld = var6.ae_fld;
					} else {
						var11.ae_fld = var0;
					}

					if (var6 != null) {
						var6.ae_fld = var11;
					} else {
						var0 = var11;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (lg var9 = var0; null != var9 && var9.ak_fld <= var1; var9 = var9.ae_fld) {
			var5 = var9;
		}

		lg var10 = new lg(var1, var2, var3, var4);
		if (var5 != null) {
			var10.ae_fld = var5.ae_fld;
		} else {
			var10.ae_fld = var0;
		}

		if (null != var5) {
			var5.ae_fld = var10;
		} else {
			var0 = var10;
		}

		return var0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;"
	)
	public static ny ak(int var0, int var1) throws EOFException {
		try {
			ny var2 = (ny)ny.av_fld.ak(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ny.az_fld.bb(5, var0, 584982574);
				var2 = new ny();
				if (var3 != null) {
					var2.as(new xi(var3), 1921676905);
				}

				ny.av_fld.az(var2, var0);
				return var2;
			}
		} catch (Throwable var4) {
			throw new RuntimeException(var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIII)Llg;"
	)
	public static lg ay(lg var0, int var1, int var2, int var3, int var4) {
		lg var5 = var0;

		for (lg var6 = null; var5 != null; var5 = var5.ae_fld) {
			if (var5.ag_fld >= var1 && var5.ak_fld <= var2) {
				if (var6 != null) {
					var6.ae_fld = var5.ae_fld;
				} else {
					var0 = var5.ae_fld;
				}

				if (var5.ak_fld < var1) {
					lg var7 = new lg(var5.ak_fld, var1 - 1, var5.az_fld, var5.av_fld);
					if (null != var6) {
						var7.ae_fld = var6.ae_fld;
					} else {
						var7.ae_fld = var0;
					}

					if (null != var6) {
						var6.ae_fld = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.ag_fld > var2) {
					lg var11 = new lg(1 + var2, 328511182 * var5.ag_fld, var5.az_fld, var5.av_fld * -796962343);
					if (null != var6) {
						var11.ae_fld = var6.ae_fld;
					} else {
						var11.ae_fld = var0;
					}

					if (var6 != null) {
						var6.ae_fld = var11;
					} else {
						var0 = var11;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (lg var9 = var0; null != var9 && var9.ak_fld <= var1; var9 = var9.ae_fld) {
			var5 = var9;
		}

		lg var10 = new lg(var1, var2, var3, var4);
		if (var5 != null) {
			var10.ae_fld = var5.ae_fld;
		} else {
			var10.ae_fld = var0;
		}

		if (null != var5) {
			var5.ae_fld = var10;
		} else {
			var0 = var10;
		}

		return var0;
	}

	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "(Lxi;I)V"
	)
	public static void uo(xi var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1 << 1 ^ var1 >> -298902334;
		var0.cr(var1, 802256456);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ak(int var1) {
		return this.az_fld;
	}
}
