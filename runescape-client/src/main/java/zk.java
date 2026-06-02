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
		descriptor = "(Lsl;II)V"
	)
	public static void ax(sl var0, int var1, int var2) {
		if (var0 != null && var0.av() > 1) {
			om.ap(var0, null, true, (byte)0);
			if (yq.ak_fld == var0.ag_fld) {
				ya.al(var0.ak(), var0.av(), var1, var2);
			} else if (yq.ag_fld == var0.ag_fld) {
				ya.au(var0.ag(), var0.av(), var1, var2);
			} else {
				ya.ax((Object[])var0.az(), var0.av(), var1, var2);
			}
		}
	}

	zk() throws Throwable {
		throw new Error();
	}
}
