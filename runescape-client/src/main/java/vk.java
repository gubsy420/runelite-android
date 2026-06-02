import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vk")
public class vk extends vw {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "J"
	)
	public long ak_fld;

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(Lcv;)V"
	)
	public static void fw(cv var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.aj_fld = rw.ak_fld;
	}

	public vk(long var1) {
		this.ak_fld = var1;
	}
}
