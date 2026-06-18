import java.io.EOFException;
import net.runelite.api.NpcOverrides;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements({"NpcOverrides"})
public class pg implements NpcOverrides {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	@ObfuscatedGetter(
		longValue = 8538303662630040619L
	)
	public long ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] az_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] av_fld;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	public boolean ae_fld = false;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ay_fld;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	@ObfuscatedGetter(
		intValue = -250949181
	)
	static int ma_fld;

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(ILoq;ILjava/lang/String;IIIIII)V"
	)
	static void fs(int var0, oq var1, int var2, String var3, int var4, int var5, int var6, int var7, int var8, int var9) throws EOFException {
		try {
			if (var0 != -1) {
				int var10 = var1.az(var2, (byte)87);

				for (int var11 = var10 - 1; var11 >= 0; var11--) {
					int var12 = var1.av(var2, var11, -2075647873);
					int var13 = var12 << 16 | var5;
					String var15 = var1.ah(var2, var11, rt.ag_fld, (byte)-52);
					if (null != var15) {
						dd.fg(var0, var15, var3, var4, var13, var6, var7, -1, var8, -970761794);
					}
				}

				if (client.cp_fld) {
					if (var9 != -1355642205) {
						return;
					}

					for (byte var17 = 1; var17 < 26; var17 += 5) {
						int var18 = var17 << 16 | var5;
						String var14 = hp.be(null, var17);
						dd.fg(var0, var14, var3, var4, var18, var6, var7, -1, var8, -1630305710);
					}
				}
			}
		} catch (Throwable var16) {
			throw new RuntimeException(var16);
		}
	}

	@ObfuscatedName("getModelIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Export("getModelIds")
	@Override
	public int[] getModelIds() {
		return this.ag_fld;
	}

	@ObfuscatedName("getTextureToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getTextureToReplaceWith")
	@Override
	public short[] getTextureToReplaceWith() {
		return this.av_fld;
	}

	@ObfuscatedName("getColorToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Export("getColorToReplaceWith")
	@Override
	public short[] getColorToReplaceWith() {
		return this.az_fld;
	}

	@ObfuscatedName("useLocalPlayer")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Export("useLocalPlayer")
	@Override
	public boolean useLocalPlayer() {
		return this.ae_fld;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lbd;Lbh;)I"
	)
	public static int hm(bd var0, bh var1) {
		if (var0 == null) {
			var0.getClass();
		}

		int var2 = 0;

		while (var0.ah_fld[var2] >= 0) {
			var2 = var1.ag() != 0 ? var0.ah_fld[var2] : var2 + 1;
		}

		return ~var0.ah_fld[var2];
	}

	public pg(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.ak_fld = var1;
		this.ag_fld = var3;
		this.az_fld = var4;
		this.av_fld = var5;
		this.ae_fld = var6;
	}
}
