import java.util.ArrayList;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("cp")
public class cp extends vw {
	@ObfuscatedGetter(
		intValue = -1411251099
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedGetter(
		intValue = 1025494695
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static un ph_fld;
	@ObfuscatedGetter(
		intValue = 1830449577
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;
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
	@ObfuscatedGetter(
		intValue = -1733196557
	)
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int az_fld;

	cp(int var1, int var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V"
	)
	void ak(int var1, int var2, int var3, int var4) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int mb() {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CLxh;)C"
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

	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	public static void re(wl var0) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.bt_fld = null;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V"
	)
	static void bh(String var0, int var1) {
		sx.av(0, 0);
		ArrayList var3 = new ArrayList();
		var3.add(new me(eo.hx_fld, var0, "", var1, false));
		hi.az(var3, 0, 0, 0, 100, false, (short)-990);
	}
}
