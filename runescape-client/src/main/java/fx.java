import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("fx")
public interface fx {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	int[] aa(int var1) throws EOFException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int av(int var1, byte var2);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ae(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I"
	)
	int[] an(int var1) throws EOFException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ap(int var1);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int am(int var1);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int aq(int var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ai(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int ad(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ao(int var1);

	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	default int tx(int var1) {
		return this.av(var1, (byte)-49);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ab(int var1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[I"
	)
	int[] az(int var1, int var2) throws EOFException;
}
