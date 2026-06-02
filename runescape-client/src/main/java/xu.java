import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xu")
public class xu {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] ag_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ak_fld = new int[8];

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lxu;I)[I"
	)
	public static int[] it(xu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] ae() {
		return this.ak_fld;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lxu;[I[S)V"
	)
	public static void cu(xu var0, int[] var1, short[] var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			var0.ak_fld = var1;
			var0.ag_fld = var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void ar(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void az(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(Lao;Laj;I)V"
	)
	public static void el(ao var0, aj var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		int var3 = var2 >> 5;
		aj var4 = var0.bs_fld[var3];
		if (null == var4) {
			var0.be_fld[var3] = var1;
		} else {
			var4.aq_fld = var1;
		}

		var0.bs_fld[var3] = var1;
		var1.am_fld = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	public short[] ag() {
		return this.ag_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void ah(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void aw(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void ay(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void as(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void av(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	public xu(pp var1) {
		this.ag_fld = new short[8];
		int var2 = 0;
		if (var1.ap(2069660196)) {
			var2 = var1.aa(1810183661).length;
			System.arraycopy(var1.aa(1259406936), 0, this.ak_fld, 0, var2);
			System.arraycopy(var1.aq(-1910412766), 0, this.ag_fld, 0, var2);
		}

		for (int var3 = var2; var3 < 8; var3++) {
			this.ak_fld[var3] = -1;
			this.ag_fld[var3] = -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	public int[] ak(int var1) {
		return this.ak_fld;
	}
}
