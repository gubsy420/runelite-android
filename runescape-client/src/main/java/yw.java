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
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -201871515
	)
	int ag_fld;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int at_fld;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void af() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V"
	)
	public void ak(int var1) {
		this.ak_fld[(this.ag_fld += 215542381) * -201871515 - 1] = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I"
	)
	public int az() {
		return this.ag_fld;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ay(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ah(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int aw(int var1) {
		return this.ak_fld[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	public void av() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int mf(int var1) {
		return wk(this, var1, (byte)104);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int aa() {
		return this.az();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	public int ar() {
		return this.ag_fld;
	}

	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "(Lyw;IB)I"
	)
	public static int wk(yw var0, int var1, byte var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak_fld[var1];
	}

	public yw(int var1) {
		this.ak_fld = new int[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()V"
	)
	public void al() {
		this.ag_fld = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	public int ag(int var1, byte var2) {
		return this.ak_fld[var1];
	}
}
