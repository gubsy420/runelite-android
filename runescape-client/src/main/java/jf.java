import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("jf")
public class jf implements xm {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public static jf ak_fld = new jf(0, 0, false, false);
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public static jf ag_fld = new jf(1, 1, true, false);
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public static jf az_fld = new jf(2, 2, true, true);
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ax_fld;
	@ObfuscatedGetter(
		intValue = -238867033
	)
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ae_fld;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean aw_fld;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ah_fld;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	public static jf ay_fld = az_fld;
	@ObfuscatedGetter(
		intValue = -1972210161
	)
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int av_fld;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	jf(int var1, int var2, boolean var3, boolean var4) {
		this.av_fld = var1;
		this.ae_fld = var2;
		this.aw_fld = var3;
		this.ah_fld = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(J)I"
	)
	public static int av(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Ldx;III)I"
	)
	static final int dv(dx var0, int var1, int var2, int var3) throws EOFException {
		return var0.an(var1, var2, var3, 1764729525);
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZ)V"
	)
	static void dj(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) throws EOFException {
		fg.es(hk.mt_fld, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static final int ad(int var0, int var1) {
		if (-1 == var0) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
