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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	public int[] ae() {
		return this.ak_fld;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lxu;B)[S"
	)
	public static short[] dp(xu var0, byte var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ag_fld;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void as(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IISS)V"
	)
	public void az(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void af(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqf;)Z"
	)
	public static boolean ah(qf var0) {
		if (var0 == null) {
			var0.getClass();
		}

		return false;
	}

	@ObfuscatedName("zg")
	@ObfuscatedSignature(
		descriptor = "(Lxu;I)[I"
	)
	public static int[] zg(xu var0, int var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak_fld;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)V"
	)
	public void ay(int var1, int var2, short var3) {
		this.ak_fld[var1] = var2;
		this.ag_fld[var1] = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[S)V"
	)
	public void ar(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V"
	)
	public void av(int[] var1, short[] var2) {
		this.ak_fld = var1;
		this.ag_fld = var2;
	}

	public xu(pp var1) {
		this.ag_fld = new short[8];
		int var2 = 0;
		if (var1.ap(2069660196)) {
			var2 = pp.mm(var1, 1810183661).length;
			System.arraycopy(pp.mm(var1, 1259406936), 0, this.ak_fld, 0, var2);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[S"
	)
	public short[] ag(byte var1) {
		return this.ag_fld;
	}
}
