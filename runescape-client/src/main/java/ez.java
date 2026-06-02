import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ez")
public class ez implements xm {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public static ez az_fld = new ez(0, 2);
	@ObfuscatedGetter(
		intValue = 858506829
	)
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int aw_fld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ab_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public static ez av_fld = new ez(3, 3);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public static ez ae_fld = new ez(4, 4);
	@ObfuscatedGetter(
		intValue = 839071497
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ah_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public static ez ag_fld = new ez(1, 1);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public static ez ak_fld = new ez(2, 0);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.aw_fld;
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Lrl;Lrl;)I"
	)
	public static int ej(xq var0, rl var1, rl var2) {
		return var0.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 978535660) : var2.ap(-1939318074).av(var1.ap(-1939318074), 450860119);
	}

	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "(Lpw;Lxi;I)V"
	)
	public static void sp(pw var0, xi var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (249 == var2) {
				var0.az_fld = nc.ak(var1, var0.az_fld);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.aw_fld;
	}

	ez(int var1, int var2) {
		this.ah_fld = var1;
		this.aw_fld = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.aw_fld;
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
