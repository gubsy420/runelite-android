import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kp")
public class kp extends vc {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] av_fld;
	@ObfuscatedGetter(
		intValue = 1695529785
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;
	@ObfuscatedGetter(
		intValue = 1318626859
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	public int[] az_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean av(int var1, int var2) {
		if (var2 >= 0 && var2 < this.av_fld.length) {
			int var3 = this.av_fld[var2];
			if (var1 >= var3 && var1 <= var3 + this.az_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int fa() {
		return this.ak_fld;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] qz() {
		return this.az_fld;
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] tl() {
		return this.av_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ag(int var1, int var2) {
		if (var2 >= 0 && var2 < this.av_fld.length) {
			int var3 = this.av_fld[var2];
			if (var1 >= var3 && var1 <= var3 + this.az_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean az(int var1, int var2) {
		if (var2 >= 0 && var2 < this.av_fld.length) {
			int var3 = this.av_fld[var2];
			if (var1 >= var3 && var1 <= var3 + this.az_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	kp(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
		this.av_fld = var4;
	}

	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "(Lkp;II)Z"
	)
	public static boolean uz(kp var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 >= 0 && var2 < var0.av_fld.length) {
			int var4 = var0.av_fld[var2];
			if (var1 >= var4 && var1 <= var4 + var0.az_fld[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	public boolean ch(int var1, int var2) {
		return uz(this, var1, var2);
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int de() {
		return this.ag_fld;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z"
	)
	public boolean ak(int var1, int var2, int var3) {
		if (var2 >= 0 && var2 < this.av_fld.length) {
			int var4 = this.az_fld[var2];
			if (var1 >= var4 && var1 <= var4 + this.az_fld[var2]) {
				return true;
			}
		}

		return false;
	}
}
