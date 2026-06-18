import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("wr")
public interface wr extends Iterable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	void av(int var1, Object var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int ak(int var1, byte var2) throws EOFException;

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lli;)I"
	)
	static int fy(li var0) {
		return var0.bd_fld;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int az(int var1) throws EOFException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V"
	)
	void ag(int var1, Object var2, int var3);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	void ae(int var1, Object var2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	void ah(int var1, Object var2);
}
