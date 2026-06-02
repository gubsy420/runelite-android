import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("gt")
public class gt implements xm {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static gt ag_fld = new gt((byte)0);
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int by_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static gt az_fld = new gt((byte)1);
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static gt av_fld = new gt((byte)2);
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "B"
	)
	byte ae_fld;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static gt ak_fld = new gt((byte)-1);
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ce_fld;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static ik be_fld;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int br_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lub;Lub;I)Lfe;"
	)
	public static fe ak(ub var0, ub var1, int var2) throws EOFException {
		boolean var4 = true;
		int var5 = -1;
		int[] var6 = var0.cp(var2, (byte)97);

		for (int var7 = 0; var7 < var6.length; var7++) {
			byte[] var8 = var0.cx(var2, var6[var7], -1052226032);
			if (var8 == null) {
				var4 = false;
			} else if (-1 == var5) {
				var5 = (var8[0] & 255) << 8 | var8[1] & 255;
			}
		}

		if (-1 != var5) {
			byte[] var10 = var1.cx(var5, 0, -973906328);
			if (null == var10) {
				var4 = false;
			}
		} else {
			var4 = false;
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new fe(var0, var1, var2);
			} catch (Exception var9) {
				return null;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()[Lgt;"
	)
	public static gt[] ay() {
		return new gt[]{ag_fld, av_fld, ak_fld, az_fld};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int av() {
		return this.ae_fld;
	}

	gt(byte var1) {
		this.ae_fld = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ah() {
		return this.ae_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lgt;"
	)
	public static gt[] az() {
		return new gt[]{ag_fld, av_fld, ak_fld, az_fld};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()[Lgt;"
	)
	public static gt[] aw() {
		return new gt[]{ag_fld, av_fld, ak_fld, az_fld};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int ae() {
		return this.ae_fld;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	static int ag(int var0, int var1) {
		return fa.ay_fld[var0] * 128 + (var1 << 7);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	@Override
	public int ag(int var1) {
		return this.ae_fld;
	}
}
