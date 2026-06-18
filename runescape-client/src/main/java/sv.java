import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("sv")
public class sv implements xm {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv ae_fld = new sv(4, 4);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv ag_fld = new sv(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv az_fld = new sv(2, 2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv ak_fld = new sv(0, 0);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv av_fld = new sv(3, 3);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv ah_fld = new sv(5, 5);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv aw_fld = new sv(6, 6);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -323232499
	)
	int ar_fld;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv as_fld = new sv(8, 8);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	static sv ay_fld = new sv(7, 7);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -1626279033
	)
	int af_fld;

	sv(int var1, int var2) {
		this.ar_fld = var1;
		this.af_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.af_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.af_fld;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Luy;Luy;)V"
	)
	public static void ii(uy var0, uy var1) {
		if (var0 == null) {
			var0.getClass();
		} else {
			uy.es(var0, var1, -464363234);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.af_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.af_fld;
	}
}
