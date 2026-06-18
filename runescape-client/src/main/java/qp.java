import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qp")
public class qp {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int av_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	public static int ae(qa var0, int var1, qy var2) throws EOFException {
		byte var3 = 0;
		if (!qa.jv(var0, -547871024)) {
			qa.uh(var0, 0, (short)256);
			return var3;
		} else {
			ol var4 = qa.kw(var0, 752228892);
			if (-1 == var4.bl_fld) {
				var3 |= 8;
			}

			if (var4.ao((byte)-32)) {
				qa.uh(var0, 0, (short)256);
			} else {
				qa.uh(var0, var0.al() + var1, (short)256);
			}

			int var5;
			if (!var4.aa(-707819531)) {
				var5 = var3 | hd.ag(var0, var1, var2);
			} else {
				var5 = var3 | pl.az(var0, var1, var2);
			}

			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	public static int av(qa var0, int var1, qy var2) throws EOFException {
		byte var3 = 0;
		if (!qa.jv(var0, 884942233)) {
			qa.uh(var0, 0, (short)256);
			return var3;
		} else {
			ol var4 = qa.kw(var0, 545739500);
			if (-1 == var4.bl_fld) {
				var3 |= 8;
			}

			if (var4.ao((byte)25)) {
				qa.uh(var0, 0, (short)256);
			} else {
				qa.uh(var0, var0.al() + var1, (short)256);
			}

			int var5;
			if (!var4.aa(1276374030)) {
				var5 = var3 | hd.ag(var0, var1, var2);
			} else {
				var5 = var3 | pl.az(var0, var1, var2);
			}

			return var5;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int aw(qa var0, int var1, qy var2) {
		byte var3 = 0;
		ol var4 = qa.kw(var0, -1965677411);
		if (var4.bl_fld > 0 && var1 > 0) {
			var1 -= (var1 - 1) / var4.bl_fld * var4.bl_fld;
		}

		int var5 = var0.aw(-1431102927);
		int var6 = var0.as();

		while (var1 > 0) {
			var1--;
			var5++;
			var3 |= 4;
			if (0 == (var3 & 2) && var2 != null) {
				var2.ak(var4, var5, -630398320);
			}

			int var7 = var4.ai(-1509908899);
			if (var5 >= var7) {
				var6++;
				var3 |= 1;
				var5 -= var4.bl_fld;
				if (var6 >= var4.bn_fld) {
					var3 |= 2;
				}

				if (var5 < 0 || var5 >= var7) {
					var3 |= 2;
					var5 = 0;
				}

				if (0 == (var3 & 2) && var2 != null) {
					var2.ak(var4, var5, 1679551068);
				}
			}
		}

		qa.tk(var0, var5, var6);
		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int ah(qa var0, int var1, qy var2) {
		byte var3 = 0;
		ol var4 = qa.kw(var0, -1188339784);
		if (var4.bl_fld > 0 && var4.by_fld > 0) {
			var1 %= var4.by_fld;
		}

		int var5 = var0.aw(481257475);
		int var6 = var0.ay();
		int var7 = var0.as();
		if (var5 >= var4.bk_fld.length) {
			var5 = 0;
			var6 = 0;
		}

		var6 += var1;

		while (var6 > var4.bf_fld[var5]) {
			var6 -= var4.bf_fld[var5];
			var5++;
			var3 |= 4;
			if ((var3 & 2) == 0 && var2 != null) {
				var2.ak(var4, var5, 549526393);
			}

			if (var5 >= var4.bk_fld.length) {
				var7++;
				var3 |= 1;
				var5 -= var4.bl_fld;
				if (var7 >= var4.bn_fld) {
					var3 |= 2;
				}

				if (var5 < 0 || var5 >= var4.bk_fld.length) {
					var3 |= 2;
					var5 = 0;
				}

				if (0 == (var3 & 2) && var2 != null) {
					var2.ak(var4, var5, -1198076194);
				}
			}
		}

		var0.aa(var5, var6, var7);
		return var3;
	}

	qp() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int ay(qa var0, int var1, qy var2) {
		byte var3 = 0;
		ol var4 = qa.kw(var0, -1407240925);
		if (var4.bl_fld > 0 && var1 > 0) {
			var1 -= (var1 - 1) / var4.bl_fld * var4.bl_fld;
		}

		int var5 = var0.aw(1592467296);
		int var6 = var0.as();

		while (var1 > 0) {
			var1--;
			var5++;
			var3 |= 4;
			if (0 == (var3 & 2) && var2 != null) {
				var2.ak(var4, var5, 584011578);
			}

			int var7 = var4.ai(-1509908899);
			if (var5 >= var7) {
				var6++;
				var3 |= 1;
				var5 -= var4.bl_fld;
				if (var6 >= var4.bn_fld) {
					var3 |= 2;
				}

				if (var5 < 0 || var5 >= var7) {
					var3 |= 2;
					var5 = 0;
				}

				if (0 == (var3 & 2) && var2 != null) {
					var2.ak(var4, var5, 1397593300);
				}
			}
		}

		qa.tk(var0, var5, var6);
		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqa;ILqy;)I"
	)
	static int as(qa var0, int var1, qy var2) {
		byte var3 = 0;
		ol var4 = qa.kw(var0, 1933871695);
		if (var4.bl_fld > 0 && var1 > 0) {
			var1 -= (var1 - 1) / var4.bl_fld * var4.bl_fld;
		}

		int var5 = var0.aw(-314314164);
		int var6 = var0.as();

		while (var1 > 0) {
			var1--;
			var5++;
			var3 |= 4;
			if (0 == (var3 & 2) && var2 != null) {
				var2.ak(var4, var5, 1308887512);
			}

			int var7 = var4.ai(-1509908899);
			if (var5 >= var7) {
				var6++;
				var3 |= 1;
				var5 -= var4.bl_fld;
				if (var6 >= var4.bn_fld) {
					var3 |= 2;
				}

				if (var5 < 0 || var5 >= var7) {
					var3 |= 2;
					var5 = 0;
				}

				if (0 == (var3 & 2) && var2 != null) {
					var2.ak(var4, var5, -404385462);
				}
			}
		}

		qa.tk(var0, var5, var6);
		return var3;
	}
}
