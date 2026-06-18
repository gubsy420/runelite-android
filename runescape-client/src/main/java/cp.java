import java.io.EOFException;
import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cp")
public class cp extends vw {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1411251099
	)
	int az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1025494695
	)
	int av_fld;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static un ph_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1830449577
	)
	int ag_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ab_fld;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bd_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1733196557
	)
	int ak_fld;

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Loe;ILjava/lang/String;)Ljava/lang/String;"
	)
	public static String jy(oe var0, int var1, String var2) {
		return ih.av(var0.es_fld, var1, var2);
	}

	cp(int var1, int var2, int var3, int var4) {
		this.av_fld = var1;
		this.az_fld = var2;
		this.ak_fld = var3;
		this.ag_fld = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V"
	)
	void ak(int var1, int var2, int var3, int var4) {
		this.av_fld = var1;
		this.az_fld = var2;
		this.ak_fld = var3;
		this.ag_fld = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CLxh;B)C"
	)
	static char ag(char var0, xh var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (209 == var0 && var1 != xh.ah_fld) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (221 == var0) {
				return 'Y';
			}

			if (223 == var0) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (231 == var0) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && xh.ah_fld != var1) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (338 == var0) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}

	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "(Ldi;Lxj;)V"
	)
	public static void sa(di var0, xj var1) throws EOFException {
		try {
			if (var0 == null) {
				var0.getClass();
			} else {
				var0.an();
				var1.as(-1765525869);
				int var2 = client.dj_fld * -1593647060;
				cl var3 = var0.av_fld[var2];
				int var4 = var1.ar(30, -106081977);
				cl.yp(var3, -1, (byte)1);
				var3.az_fld.ar(var4);
				var3.av_fld = 0;
				var0.al_fld = 0;
				var0.ar_fld[(var0.al_fld += 1227014965) * -1482869773 - 1] = var2;
				var0.au_fld = 0;

				for (int var5 = 1; var5 < 2048; var5++) {
					if (var5 != var2) {
						int var6 = var1.ar(18, -106081977);
						int var7 = var6 >> 16;
						int var8 = var6 >> 8 & -1813100345;
						int var9 = var6 & -252866092;
						cl.yp(var0.av_fld[var5], kj.ak(var7, var8, var9), (byte)1);
						var0.az_fld[(var0.au_fld += -260300649) * 1540972327 - 1] = var5;
					}
				}

				var1.af(366283578);
			}
		} catch (Throwable var11) {
			throw new RuntimeException(var11);
		}
	}

	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int tw() {
		return this.ak_fld;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V"
	)
	static void bh(String var0, int var1) {
		sx.av(0, 0);
		ArrayList var3 = new ArrayList();
		var3.add(new me(eo.hx_fld, var0, "", var1, false));
		hi.az(var3, 0, 0, 0, 100, false, (short)-990);
	}
}
