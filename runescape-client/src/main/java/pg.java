import java.io.EOFException;
import net.runelite.api.NpcOverrides;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedGetter;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements({"NpcOverrides"})
public class pg implements NpcOverrides {
	@ObfuscatedGetter(
		longValue = 8538303662630040619L
	)
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[I"
	)
	int[] ag_fld;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] av_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[S"
	)
	short[] az_fld;
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
	@ObfuscatedGetter(
		intValue = -250949181
	)
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	static int ma_fld;

	@ObfuscatedName("getTextureToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getTextureToReplaceWith() {
		return this.az_fld;
	}

	@ObfuscatedName("getModelIds")
	@ObfuscatedSignature(
		descriptor = "()[I"
	)
	@Override
	public int[] getModelIds() {
		return this.ag_fld;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)Ljava/lang/String;"
	)
	public static String ks(yz var0) {
		return var0.af_fld;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(Lnw;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int dp(nw var0, Object var1, Object var2) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ak((nl)var1, (nl)var2, -1371272090);
		}
	}

	@ObfuscatedName("useLocalPlayer")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	@Override
	public boolean useLocalPlayer() {
		return this.ae_fld;
	}

	@ObfuscatedName("getColorToReplaceWith")
	@ObfuscatedSignature(
		descriptor = "()[S"
	)
	@Override
	public short[] getColorToReplaceWith() {
		return this.av_fld;
	}

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

	public pg(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.ak_fld = var1;
		this.ag_fld = var3;
		this.av_fld = var4;
		this.az_fld = var5;
		this.ae_fld = var6;
	}
}
