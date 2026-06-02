import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kt")
public class kt implements xm {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int bf_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public static kt aw_fld = kt.az_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public static kt ag_fld = new kt(1, 1);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public static kt av_fld = new kt(3, 3);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public static kt az_fld = new kt(2, 2);
	@ObfuscatedGetter(
		intValue = 1448568713
	)
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ah_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public static kt ak_fld = new kt(0, 0);
	@ObfuscatedGetter(
		intValue = 1043975269
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ah_fld;
	}

	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	public static void ra(mw var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aw_fld.au_fld = -228932457;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;II)V"
	)
	public static void ao(sl var0, sl var1, int var2, int var3) {
		om.ap(var0, null, true, (byte)0);
		yq var4 = var0.ag_fld;
		om.ap(var1, var4, false, (byte)0);
		if (var2 >= 0) {
			if (var3 == 998662932) {
				return;
			}

			if (var2 <= var0.av_fld) {
				if (0 == var1.av_fld) {
					return;
				}

				var0.ay(var0.av_fld + var1.av_fld, -210674912);
				if (var2 < var0.av_fld) {
					eb.aj(var0, var2, var0, var1.av_fld + var2, var0.av_fld - var2);
				}

				eb.aj(var1, 0, var0, var2, var1.av_fld);
				var0.av_fld = var0.av_fld + var1.av_fld;
				return;
			}
		}

		throw new RuntimeException();
	}

	kt(int var1, int var2) {
		this.ae_fld = var1;
		this.ah_fld = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ah_fld;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ah_fld;
	}
}
