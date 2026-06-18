import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("as")
public class as {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ak_fld;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	int ag_fld;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljava/lang/String;"
	)
	String az_fld;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ljava/lang/String;"
	)
	String ak() {
		return Integer.toHexString(this.ak_fld) + Integer.toHexString(this.ag_fld) + this.az_fld;
	}

	as(xi var1) {
		this(var1.cg(), var1.cg(), xi.at(var1, -420457269));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Las;)Ljava/lang/String;"
	)
	public static String aj(as var0) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return Integer.toHexString(var0.ak_fld) + Integer.toHexString(var0.ag_fld) + var0.az_fld;
		}
	}

	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "(Leb;Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public static int vq(eb var0, Object var1, Object var2) {
		if (var0 == null) {
			var0.getClass();
		}

		return eb.qz(var0, (rr)var1, (rr)var2, -469467821);
	}

	as(int var1, int var2, String var3) {
		this.ak_fld = var1;
		this.ag_fld = var2;
		this.az_fld = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	int ag() {
		return this.ak_fld;
	}
}
