import net.runelite.api.IntegerNode;
import net.runelite.api.annotations.Implements;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vl")
@Implements({"IntegerNode"})
public class vl extends vw implements IntegerNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "I"
	)
	public int ak_fld;

	@ObfuscatedName("setValue")
	@ObfuscatedSignature(
		descriptor = "(I)V"
	)
	@Override
	public void setValue(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("ye")
	@ObfuscatedSignature(
		descriptor = "(Lov;)I"
	)
	public static int ye(ov var0) {
		return var0.au_fld;
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V"
	)
	public static void nt(ib var0, int var1) {
		var0.ak_fld.remove(var1);
		var0.ay_fld = null;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lma;)I"
	)
	public static int jg(ma var0) {
		return var0.al_fld;
	}

	@ObfuscatedName("getValue")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Override
	public int getValue() {
		return this.ak_fld;
	}

	public vl(int var1) {
		this.ak_fld = var1;
	}
}
