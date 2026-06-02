import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jt")
public class jt {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt as_fld = new jt(7);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ag_fld = new jt(17);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt az_fld = new jt(7);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt av_fld = new jt(11);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ae_fld = new jt(4);
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt au_fld = new jt(14);
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ah_fld = new jt(2);
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ay_fld = new jt(24);
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ar_fld = new jt(7);
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	static boolean dz_fld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt af_fld = new jt(14);
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt al_fld = new jt(6);
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt aw_fld = new jt(-2);
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	public static jt ak_fld = new jt(4);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZ)I"
	)
	static int ah(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; var8++) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if ('-' == var9) {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						throw new NumberFormatException();
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var6 * var1 + var11;
				if (var6 != var10 / var1) {
					throw new NumberFormatException();
				}

				var6 = var10;
				var5 = true;
			}

			if (!var5) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	jt(int var1) {
	}

	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "(Luz;FFFF)V"
	)
	public static void up(uz var0, float var1, float var2, float var3, float var4) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.av_fld = var1;
		var0.ae_fld = var2;
		var0.ah_fld = var3;
		var0.aw_fld = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()[Ljt;"
	)
	public static jt[] ag() {
		return new jt[]{ak_fld, ag_fld, az_fld, av_fld, ae_fld, ah_fld, aw_fld, ay_fld, as_fld, ar_fld, af_fld, al_fld, au_fld};
	}
}
