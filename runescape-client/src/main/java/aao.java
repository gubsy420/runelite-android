import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aao")
public class aao implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	public static aao ak_fld = new aao(5, 0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	public static aao ag_fld = new aao(3, 2);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	static aao az_fld = new aao(0, 5);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	static aao av_fld = new aao(4, 6);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	static aao ae_fld = new aao(2, 7);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Laao;"
	)
	static aao ah_fld = new aao(1, 8);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1914100845
	)
	int ay_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 824847065
	)
	int aw_fld;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.aw_fld;
	}

	aao(int var1, int var2) {
		this.ay_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z"
	)
	public boolean ak() {
		return this == ag_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.aw_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.aw_fld;
	}

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "(Laao;)Z"
	)
	public static boolean tl(aao var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0 == ag_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.aw_fld;
	}
}
