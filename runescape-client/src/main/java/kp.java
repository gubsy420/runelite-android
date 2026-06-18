import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kp")
public class kp extends vc {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] az_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1695529785
	)
	public int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1318626859
	)
	public int ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] av_fld;

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(Lkp;II)Z"
	)
	public static boolean qr(kp var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 >= 0 && var2 < var0.az_fld.length) {
			int var3 = var0.az_fld[var2];
			if (var1 >= var3 && var1 <= var3 + var0.av_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int cp() {
		return this.ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean av(int var1, int var2) {
		if (var2 >= 0 && var2 < this.az_fld.length) {
			int var3 = this.az_fld[var2];
			if (var1 >= var3 && var1 <= var3 + this.av_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean ak(int var1, int var2) {
		if (var2 >= 0 && var2 < this.az_fld.length) {
			int var4 = this.az_fld[var2];
			if (var1 >= var4 && var1 <= var4 + this.av_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] es() {
		return this.av_fld;
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int qh() {
		return this.ak_fld;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] ld() {
		return this.az_fld;
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean pd(int var1, int var2) {
		return this.ak(var1, var2);
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "(Lgf;)I"
	)
	public static int eq(gf var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ay_fld.az_fld * -1683164347;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ag(int var1, int var2) {
		if (var2 >= 0 && var2 < this.az_fld.length) {
			int var3 = this.az_fld[var2];
			if (var1 >= var3 && var1 <= var3 + this.av_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	kp(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.av_fld = var3;
		this.az_fld = var4;
	}
}
