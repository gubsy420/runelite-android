import java.util.List;
import java.util.Map;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("tp")
public interface tp extends tn {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Lyo;Ljava/lang/Object;I)Ljava/util/List;"
	)
	static List hu(yo var0, Object var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)(Map)var0.ae_fld.get(var2);
		return (List)(List)var3.get(var1);
	}
}
