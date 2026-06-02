import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("yw")
public class yw {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ar_fld;
	@ObfuscatedGetter(
		intValue = -201871515
	)
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lyw;I)I"
	)
	public static int nl(yw var0, int var1) {
		return var0.ak_fld[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lyw;)V"
	)
	public static void ab(yw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ae(int var1) {
		this.ak_fld[(this.ag_fld += 215542381) * -201871515 - 1] = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void ak(int var1) {
		this.ak_fld[(this.ag_fld += 215542381) * -201871515 - 1] = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int az() {
		return this.ag_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int kv(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.ag(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int hs() {
		return this.az();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void av() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int as() {
		return this.ag_fld;
	}

	public yw(int var1) {
		this.ak_fld = new int[var1];
	}
}
