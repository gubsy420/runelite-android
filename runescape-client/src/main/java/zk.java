import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("zk")
public class zk {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public static int ak_fld;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsl;III)V"
	)
	public static void ax(sl var0, int var1, int var2) {
		if (var0 != null && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (yq.ak_fld == var0.ag_fld) {
				ya.al(var0.ak(), var0.av(), var1, var2);
			} else if (yq.ag_fld == var0.ag_fld) {
				ya.au(sl.ob(var0, 1264757944), var0.av(), var1, var2);
			} else {
				ya.ax((Object[])var0.az(), var0.av(), var1, var2);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lev;III)Lef;"
	)
	public static ef ao(ev var0, int var1, int var2, int var3) {
		ei var4 = var0.bl_fld[var1][var2][var3];
		return var4 != null && var4.ai_fld != null ? var4.ai_fld : null;
	}

	zk() throws Throwable {
		throw new Error();
	}
}
