import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tv")
public class tv implements tp {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwr;"
	)
	public wr ak_fld;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = 1924770775
	)
	static int go_fld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ai_fld;

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)Z"
	)
	public static boolean mi(bt var0) {
		return !qa.jv(var0.ay_fld, -888296827);
	}

	tv(wy var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int az(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)-56);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	public int ak(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)59);
	}

	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		descriptor = "(Lub;Ljava/lang/String;)Z"
	)
	public static boolean tt(ub var0, String var1) throws EOFException {
		if (var0 == null) {
			var0.getClass();
		}

		var1 = var1.toLowerCase();
		int var2 = yd.fx(var0.bf_fld, ov.ar(var1));
		return var0.dz(var2, -1517200498);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int ag(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)11);
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(Lfn;Lsp;I)V"
	)
	public static void fn(fn var0, sp var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		ea var3 = var1.ah_fld;

		for (int var4 = 0; var4 < var3.ah_fld; var4++) {
			int var5 = var3.aw_fld[var4];
			if (var5 == 5 && var1.av_fld != null && var1.av_fld[var4] != null && var1.av_fld[var4][0] != null && var0.ci_fld != null && var0.cv_fld != null) {
				sn var6 = var1.av_fld[var4][0];

				for (int var10 : var3.ay_fld[var4]) {
					if (var10 < var0.ci_fld.length) {
						int[] var11 = var0.ci_fld[var10];

						for (int var12 = 0; var12 < var11.length; var12++) {
							int var13 = var11[var12];
							int var14 = (int)((var0.cv_fld[var13] & 255) + var6.az(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							var0.cv_fld[var13] = (byte)var14;
						}
					}
				}
			}
		}
	}

	public tv(tq var1) {
		this(new wy(var1));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	public int av(int var1) throws EOFException {
		return this.ak_fld.ak(var1, (byte)102);
	}
}
