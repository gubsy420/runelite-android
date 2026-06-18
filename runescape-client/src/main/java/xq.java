import java.util.Comparator;
import net.runelite.api.annotations.Export;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("xq")
public class xq implements Comparator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Z"
	)
	boolean ak_fld;

	public xq(boolean var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("equals")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	@Export("equals")
	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int aw(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1826924381);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;I)I"
	)
	int ak(rl var1, rl var2, int var3) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1642138578) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1116998577);
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Ljava/lang/Object;)Z"
	)
	public static boolean nh(xq var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("yq")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Lrl;Lrl;)I"
	)
	public static int yq(xq var0, rl var1, rl var2) {
		return var0.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -2111894561) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1397433173);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;)Z"
	)
	public boolean jm(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Ljava/lang/Object;)Z"
	)
	public static boolean cb(xq var0, Object var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.equals(var1);
	}

	@ObfuscatedName("compare")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	@Override
	public int compare(Object var1, Object var2) {
		return this.ak((rl)var1, (rl)var2, 1652650723);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int az(rl var1, rl var2) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1705163050) : var2.ap(-1939318074).av(var1.ap(-1939318074), 1270366105);
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lxq;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int ny(xq var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.ak((rl)var1, (rl)var2, 1546946362);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int av(rl var1, rl var2) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), -1775925844) : var2.ap(-1939318074).av(var1.ap(-1939318074), -781281659);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;)I"
	)
	int ay(rl var1, rl var2) {
		return this.ak_fld ? var1.ap(-1939318074).av(var2.ap(-1939318074), 978535660) : var2.ap(-1939318074).av(var1.ap(-1939318074), 450860119);
	}
}
