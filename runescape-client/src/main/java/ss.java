import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ss")
public class ss implements xm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	public static ss ag_fld = new ss(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	public static ss az_fld = new ss(2, 2);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ay_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1516560481
	)
	int ae_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1470555267
	)
	int av_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static ss ak_fld = new ss(0, 0);
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int af_fld;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int cq_fld;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ap_fld;

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Lzv;Ljava/lang/String;IIIII[I)V"
	)
	public static void pm(zv var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1 != null) {
			zv.on(var0, var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = var0.hy(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); var10++) {
				var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
			}

			var0.bx(var1, var2 - var0.an(var1) / 2, var3, var8, null, var9);
		}
	}

	ss(int var1, int var2) {
		this.ae_fld = var1;
		this.av_fld = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lss;"
	)
	public static ss[] aw() {
		return new ss[]{ak_fld, ag_fld, az_fld};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.av_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.av_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.av_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lss;"
	)
	public static ss[] az() {
		return new ss[]{ak_fld, ag_fld, az_fld};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.av_fld;
	}
}
