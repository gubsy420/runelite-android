import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("kc")
public class kc implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	public static kc ak_fld = new kc(0, 0);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static kc ag_fld = new kc(1, 1);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static kc az_fld = new kc(2, 2);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static kc av_fld = new kc(3, 3);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1895191005
	)
	public int ae_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 864241853
	)
	int ah_fld;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ah_fld;
	}

	kc(int var1, int var2) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lkc;"
	)
	public static kc[] az() {
		return new kc[]{ak_fld, ag_fld, az_fld, av_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lkc;"
	)
	public static kc[] aw() {
		return new kc[]{ak_fld, ag_fld, az_fld, av_fld};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lkc;"
	)
	public static kc[] ay() {
		return new kc[]{ak_fld, ag_fld, az_fld, av_fld};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;"
	)
	public static String ak(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var9 = (CharSequence)var0[var1];
			return null == var9 ? "null" : var9.toString();
		} else {
			int var4 = var2 + var1;
			int var5 = 0;

			for (int var6 = var1; var6 < var4; var6++) {
				CharSequence var7 = (CharSequence)var0[var6];
				if (null == var7) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var4; var11++) {
				CharSequence var8 = (CharSequence)var0[var11];
				if (null == var8) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}
}
