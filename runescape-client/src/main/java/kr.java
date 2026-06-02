import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kr")
public class kr implements xm {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cd_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static kr ag_fld = new kr(1, 1);
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ad_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static kr ak_fld = new kr(0, 0);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public static kr az_fld = new kr(2, 2);
	@ObfuscatedGetter(
		intValue = 1792596829
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int av_fld;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ba_fld;
	@ObfuscatedGetter(
		intValue = 1819709731
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	kr(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}
}
