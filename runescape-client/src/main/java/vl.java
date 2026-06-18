import net.runelite.api.IntegerNode;
import net.runelite.api.annotations.Export;
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
	@Export("setValue")
	@Override
	public void setValue(int var1) {
		this.ak_fld = var1;
	}

	@ObfuscatedName("getValue")
	@ObfuscatedSignature(
		descriptor = "()I"
	)
	@Export("getValue")
	@Override
	public int getValue() {
		return this.ak_fld;
	}

	public vl(int var1) {
		this.ak_fld = var1;
	}
}
