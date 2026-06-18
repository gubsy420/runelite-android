import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("nl")
public class nl {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int as_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = -1950941588164690461L
	)
	public long ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public nb az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String av_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1790228487
	)
	public int ak_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String ae_fld;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;"
	)
	public String ag() {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String av() {
		return this.av_fld;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)Ljava/lang/String;"
	)
	public static String dq(nl var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	public String az() {
		return this.av_fld;
	}

	nl(xi var1, byte var2, int var3) {
		this.av_fld = xi.at(var1, 871968036);
		this.ae_fld = xi.at(var1, 739294229);
		this.ak_fld = var1.cm();
		this.ag_fld = var1.cu();
		int var4 = var1.co((byte)-71);
		int var5 = var1.co((byte)-82);
		this.az_fld = new nb();
		this.az_fld.az(2, -1109717602);
		nb.ok(this.az_fld, var2);
		this.az_fld.az_fld = var4;
		this.az_fld.av_fld = var5;
		this.az_fld.ae_fld = 0;
		this.az_fld.ah_fld = 0;
		this.az_fld.ag_fld = var3;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lgc;[Llu;IIIILuo;I)V"
	)
	public static void lr(gc var0, lu[] var1, int var2, int var3, int var4, int var5, uo var6, int var7) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		} else {
			for (int var8 = var2; var8 <= var3; var8++) {
				lu var9 = var1[var8];
				if (var9 != null && var4 == var9.cv_fld && var5 == var9.cy_fld && (!var9.bj_fld || !var6.am(var9))) {
					if (var9.bx_fld == 0) {
						if (!var9.bj_fld && var6.am(var9) && !var6.ai().ag(var9)) {
							continue;
						}

						gc.gd(var0, var1, var9.cx_fld, var9.cs_fld, var9.bf_fld, var9.by_fld, var6, var7, 1783471659);
						if (null != var9.ge_fld) {
							gc.gd(var0, var9.ge_fld, 0, var9.ge_fld.length - 1, var9.bf_fld, -1, var6, var7, 679154030);
						}

						if (-1 == var9.by_fld) {
							pk var10 = (pk)xz.tw(var6.an_fld, var9.bf_fld);
							if (var10 != null) {
								var0.af(var10.ak_fld, var6, var7, (byte)-88);
							}
						}
					}

					if (var9.bx_fld == 6) {
						if (-1 != var9.dl_fld || var9.dr_fld != -1) {
							boolean var14 = var0.ar(var9);
							int var11;
							if (var14) {
								var11 = var9.dr_fld;
							} else {
								var11 = var9.dl_fld;
							}

							if (-1 != var11) {
								ol var12 = hm.ak(var11);
								if (!var12.aa(-1580099409)) {
									var9.gz_fld += var7 * 431147417;

									while (var9.gz_fld > var12.bf_fld[var9.gy_fld]) {
										var9.gz_fld = var9.gz_fld - 431147417 * var12.bf_fld[var9.gy_fld];
										var9.gy_fld++;
										if (var9.gy_fld >= var12.bk_fld.length) {
											var9.gy_fld = var9.gy_fld - var12.bl_fld;
											if (var9.gy_fld < 0 || var9.gy_fld >= var12.bk_fld.length) {
												var9.gy_fld = 0;
											}
										}
									}
								} else {
									var9.gy_fld += var7 * 1720105221;
									int var13 = var12.ai(-1509908899);
									if (var9.gy_fld >= var13) {
										var9.gy_fld = var9.gy_fld - var12.bl_fld;
										if (var9.gy_fld < 0 || var9.gy_fld >= var13) {
											var9.gy_fld = 0;
										}
									}
								}
							}
						}

						if (var9.dw_fld != 0 && !var9.bj_fld) {
							int var15 = var9.dw_fld >> 16;
							int var17 = var9.dw_fld << 16 >> 16;
							var15 *= var7;
							var17 *= var7;
							var9.dx_fld = var9.dx_fld + var15 & 2047;
							var9.ds_fld = var9.ds_fld + var17 & 2047;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;"
	)
	public static oh ag(int var0) throws EOFException {
		oh var2 = (oh)oh.ae_fld.ak(var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = oh.av_fld.bb(16, var0, 584982574);
			var2 = new oh();
			if (null != var3) {
				var2.az(new xi(var3));
			}

			oh.ae_fld.az(var2, var0);
			return var2;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;B)Lsl;"
	)
	static sl ck(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (sl)var0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(JJLzm;I)D"
	)
	public static double az(long var0, long var2, zm var4) {
		float var6;
		if (var2 > 0L) {
			float var8 = (float)var0 / (float)var2;
			float var7 = Math.max(0.0F, Math.min(var8, 1.0F));
			var6 = var7;
		} else {
			var6 = 1.0F;
		}

		double var13 = var6;
		if (!(var13 <= 0.0) && !(var13 >= 1.0)) {
			switch (var4.bz_fld) {
				case 0:
				default:
					return var13;
				case 1:
					return 1.0 - Math.cos(var13 * Math.PI / 2.0);
				case 2:
					return Math.sin(Math.PI * var13 / 2.0);
				case 3:
					return -(Math.cos(Math.PI * var13) - 1.0) / 2.0;
				case 4:
					return var13 * var13;
				case 5:
					return 1.0 - (1.0 - var13) * (1.0 - var13);
				case 6:
					return var13 < 0.5 ? var13 * (2.0 * var13) : 1.0 - Math.pow(2.0 + var13 * -2.0, 2.0) / 2.0;
				case 7:
					return var13 * (var13 * var13);
				case 8:
					return 1.0 - Math.pow(1.0 - var13, 3.0);
				case 9:
					return var13 < 0.5 ? 4.0 * var13 * var13 * var13 : 1.0 - Math.pow(-2.0 * var13 + 2.0, 3.0) / 2.0;
				case 10:
					return var13 * (var13 * var13 * var13);
				case 11:
					return 1.0 - Math.pow(1.0 - var13, 4.0);
				case 12:
					return var13 < 0.5 ? var13 * (var13 * (8.0 * var13)) * var13 : 1.0 - Math.pow(-2.0 * var13 + 2.0, 4.0) / 2.0;
				case 13:
					return var13 * (var13 * (var13 * var13 * var13));
				case 14:
					return 1.0 - Math.pow(1.0 - var13, 5.0);
				case 15:
					return var13 < 0.5 ? var13 * (var13 * (8.0 * var13) * var13 * var13) : 1.0 - Math.pow(var13 * -2.0 + 2.0, 5.0) / 2.0;
				case 16:
					return Math.pow(2.0, 10.0 * var13 - 10.0);
				case 17:
					return 1.0 - Math.pow(2.0, -10.0 * var13);
				case 18:
					return var13 < 0.5 ? Math.pow(2.0, 20.0 * var13 + 10.0) / 2.0 : (2.0 - Math.pow(2.0, var13 * -20.0 + 10.0)) / 2.0;
				case 19:
					return 1.0 - Math.sqrt(1.0 - Math.pow(var13, 2.0));
				case 20:
					return Math.sqrt(1.0 - Math.pow(var13 - 1.0, 2.0));
				case 21:
					return var13 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var13, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var13 + 2.0, 2.0)) + 1.0) / 2.0;
				case 22:
					double var18 = 1.70158;
					double var21 = 2.70158;
					return var13 * (var13 * 2.70158) * var13 - 1.70158 * var13 * var13;
				case 23:
					double var17 = 1.70158;
					double var20 = 2.70158;
					return 1.0 + 2.70158 * Math.pow(var13 - 1.0, 3.0) + 1.70158 * Math.pow(var13 - 1.0, 2.0);
				case 24:
					double var16 = 1.70158;
					double var19 = 2.5949095;
					return var13 < 0.5
						? Math.pow(2.0 * var13, 2.0) * (7.189819 * var13 - 2.5949095) / 2.0
						: (Math.pow(var13 * 2.0 - 2.0, 2.0) * ((2.0 * var13 - 2.0) * 3.5949095 + 2.5949095) + 2.0) / 2.0;
				case 25:
					double var15 = Math.PI * 2.0 / 3.0;
					return -Math.pow(2.0, var13 * 10.0 - 10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var13 * 10.0 - 10.75));
				case 26:
					double var14 = Math.PI * 2.0 / 3.0;
					return Math.pow(2.0, -10.0 * var13) * Math.sin((Math.PI * 2.0 / 3.0) * (10.0 * var13 - 0.75)) + 1.0;
				case 27:
					double var9 = Math.PI * 4.0 / 9.0;
					double var11 = Math.sin((Math.PI * 4.0 / 9.0) * (20.0 * var13 - 11.125));
					return var13 < 0.5 ? -(Math.pow(2.0, var13 * 20.0 - 10.0) * var11) / 2.0 : Math.pow(2.0, -20.0 * var13 + 10.0) * var11 / 2.0 + 1.0;
			}
		} else {
			return var13 <= 0.0 ? 0.0 : 1.0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;"
	)
	public String ak(int var1) {
		return this.av_fld;
	}
}
