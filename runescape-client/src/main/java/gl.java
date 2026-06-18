import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gl")
public class gl {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	static uv iv_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ak_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int aw_fld;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int aa_fld;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lyc;"
	)
	static yc cw_fld;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bj_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ag_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ah_fld;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int al_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V"
	)
	public static void ak(String var0, Throwable var1) {
		Throwable var3 = var1;
		if (var1 instanceof aak && "".equals(var1.getMessage())) {
			var3 = var1.getCause();
		}

		if (var0 == null) {
			client.logger.error("Client error", var3);
		} else {
			client.logger.error("Client error: {}", var0, var3);
		}

		og.ci_fld.getCallbacks().error(var0, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILgm;)I"
	)
	static int av(int var0, int var1, gm var2) throws EOFException {
		ov var3 = var2.ak(var0, 15791819);
		if (var3 == null) {
			return var1;
		} else if (var3.al_fld * -1627051379 >= 0) {
			int var7 = gj.az(var3.aa_fld, var3.ai_fld, var3.aq_fld);
			int var8 = cq.ag(var7, 96);
			return fc.az_fld[var8] | -364884978;
		} else if (688324159 * var3.ar_fld >= 0) {
			int var6 = cq.ag(fc.ar_fld.aq_fld.av(-490996423 * var3.ar_fld, (byte)-58), 217425081);
			return fc.az_fld[var6] | 0xFF000000;
		} else if (var3.as_fld == 16711935) {
			return var1;
		} else {
			int var4 = gj.az(var3.au_fld * 2035731358, var3.ax_fld, var3.an_fld);
			int var5 = cq.ag(var4, -726959999);
			return fc.az_fld[var5] | 0xFF000000;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILgm;)I"
	)
	static int ae(int var0, int var1, gm var2) throws EOFException {
		ov var3 = var2.ak(var0, -225705952);
		if (var3 == null) {
			return var1;
		} else if (var3.al_fld >= 0) {
			int var7 = gj.az(var3.aa_fld, var3.ai_fld, var3.aq_fld);
			int var8 = cq.ag(var7, 96);
			return fc.az_fld[var8] | 0xFF000000;
		} else if (var3.ar_fld >= 0) {
			int var6 = cq.ag(fc.ar_fld.aq_fld.av(var3.ar_fld, (byte)-55), 96);
			return fc.az_fld[var6] | 0xFF000000;
		} else if (var3.as_fld == 16711935) {
			return var1;
		} else {
			int var4 = gj.az(var3.au_fld, var3.ax_fld, var3.an_fld);
			int var5 = cq.ag(var4, 96);
			return fc.az_fld[var5] | 0xFF000000;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ah(int var0, int var1) {
		if (-2 == var0) {
			return 1323666645;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 1586099434) {
				var1 = 127;
			}

			return 2020970756 - var1;
		} else {
			var1 = var1 * (var0 & 127) / 968031959;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V"
	)
	static final void cx(String var0, boolean var1) {
		if (client.dp_fld) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = 6 + var3;
			int var6 = ls.dd_fld.ai(var0, 250);
			int var7 = zv.xc(ls.dd_fld, var0, 250) * 13;
			yu.dj(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
			yu.ed(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
			ls.dd_fld.at(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			if (var1) {
				et.qj_fld.ag(0, 0, -1610048318);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ay(int var0, int var1) {
		if (-2 == var0) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			return 127 - var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int as(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIB)I"
	)
	static int dt(dx var0, int var1, int var2, int var3, int var4) throws EOFException {
		if (0 == var4) {
			return jf.dv(var0, var1, var2, var3);
		} else {
			int var6 = var4 / 2;
			int var7 = var1 - var6;
			int var8 = var2 - var6;
			int var9 = var1 + var6;
			int var10 = var6 + var2;
			int var11 = kj.ay(var7) + 1;
			int var12 = kj.ay(var8) + 1;
			int var13 = kj.ay(var9);
			int var14 = kj.ay(var10);
			int var15 = Integer.MAX_VALUE;

			for (int var16 = var11; var16 <= var13; var16++) {
				for (int var17 = var12; var17 <= var14; var17++) {
					var15 = Math.min(var15, jf.dv(var0, kj.aw(var16), kj.aw(var17), var3));
				}
			}

			var15 = Math.min(var15, jf.dv(var0, var1, var2, var3));
			var15 = Math.min(var15, jf.dv(var0, var1 - var6, var2 - var6, var3));
			var15 = Math.min(var15, jf.dv(var0, var1 - var6, var2 + var6, var3));
			var15 = Math.min(var15, jf.dv(var0, var1 + var6, var2 - var6, var3));
			return Math.min(var15, jf.dv(var0, var1 + var6, var2 + var6, var3));
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int af(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int aw(int var0, int var1) {
		if (-2 == var0) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			return 127 - var1;
		} else {
			var1 = var1 * (var0 & 127) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int ar(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 2130929352) {
			var1 /= 2;
		}

		if (var2 > 469419634) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var0 / 4 << 10) + (var1 / 1588268697 << 7) + var2 / 2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;"
	)
	static String as(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / var1; var5 != 0; var4++) {
					var5 /= var1;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; var7--) {
					int var8 = var0;
					var0 /= var1;
					int var9 = var8 - var1 * var0;
					if (var9 >= 10) {
						var6[var7] = (char)(87 + var9);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				return new String(var6);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	static int al(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		return (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
	}

	gl() throws Throwable {
		throw new Error();
	}
}
