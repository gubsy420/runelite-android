import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ym")
public class ym implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lym;"
	)
	public static ym ak_fld = new ym(0, 0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lym;"
	)
	static ym ag_fld = new ym(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lym;"
	)
	static ym az_fld = new ym(2, 2);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 2086400689
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -79906945
	)
	public int av_fld;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lym;"
	)
	public static ym[] az() {
		return new ym[]{az_fld, ak_fld, ag_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
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

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ley;J)V"
	)
	public static void jl(ey var0, long var1) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.az_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	ym(int var1, int var2) {
		this.av_fld = var1;
		this.ae_fld = var2;
	}
}
