import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("qj")
public class qj {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static qj ag_fld = new qj("Bearer");
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static qj ak_fld = new qj("Basic");
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String az_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bk_fld;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ao_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ak() {
		return this.az_fld;
	}

	@ObfuscatedName("zv")
	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	public static void zv(da var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.dm_fld = 0;
		var0.dr_fld = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(DDD)I"
	)
	public static final int ak(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0 != var2) {
			double var12;
			if (var4 < 0.5) {
				var12 = var4 * (var2 + 1.0);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = var4 * 2.0 - var12;
			double var16 = 0.3333333333333333 + var0;
			if (var16 > 1.0) {
				var16--;
			}

			double var20 = var0 - 0.3333333333333333;
			if (var20 < 0.0) {
				var20++;
			}

			if (var16 * 6.0 < 1.0) {
				var6 = var16 * ((var12 - var14) * 6.0) + var14;
			} else if (var16 * 2.0 < 1.0) {
				var6 = var12;
			} else if (var16 * 3.0 < 2.0) {
				var6 = 6.0 * ((0.6666666666666666 - var16) * (var12 - var14)) + var14;
			} else {
				var6 = var14;
			}

			if (6.0 * var0 < 1.0) {
				var8 = var14 + (var12 - var14) * 6.0 * var0;
			} else if (2.0 * var0 < 1.0) {
				var8 = var12;
			} else if (var0 * 3.0 < 2.0) {
				var8 = 6.0 * ((0.6666666666666666 - var0) * (var12 - var14)) + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0 < 1.0) {
				var10 = var14 + var20 * (6.0 * (var12 - var14));
			} else if (var20 * 2.0 < 1.0) {
				var10 = var12;
			} else if (3.0 * var20 < 2.0) {
				var10 = var14 + (var12 - var14) * (0.6666666666666666 - var20) * 6.0;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0);
		int var13 = (int)(256.0 * var8);
		int var23 = (int)(var10 * 256.0);
		return var23 + (var13 << 8) + (var22 << 16);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;Ljava/lang/String;)[Lyc;"
	)
	public static yc[] ah(ub var0, String var1, String var2) throws EOFException {
		if (!ub.mo(var0, var1, var2, (byte)-81)) {
			return null;
		} else {
			int var4 = var0.cm(var1, (byte)1);
			int var5 = var0.cz(var4, var2, -792008869);
			return ck.ak(var0, var4, var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String az() {
		return this.az_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String av() {
		return this.az_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ag() {
		return this.az_fld;
	}

	qj(String var1) {
		this.az_fld = var1;
	}
}
