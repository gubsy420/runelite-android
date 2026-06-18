import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("oq")
public interface oq {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int au(int var1, int var2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z"
	)
	boolean ag(int var1, int var2) throws EOFException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I"
	)
	int az(int var1, byte var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ak(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ljava/lang/String;"
	)
	String ae(int var1, int[] var2, int var3) throws EOFException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Ljava/lang/String;"
	)
	String ah(int var1, int var2, int[] var3, byte var4) throws EOFException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean as(int var1) throws EOFException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean ay();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z"
	)
	boolean ar(int var1) throws EOFException;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I"
	)
	int ax(int var1, int var2);

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lyz;)I"
	)
	static int ih(yz var0) {
		return var0.au_fld;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int af(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I"
	)
	int al(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Z"
	)
	boolean aw();

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Lwl;)V"
	)
	static void gl(wl var0) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.bo_fld = 702894342;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	String aq(int var1, int var2, int[] var3) throws EOFException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[I)Ljava/lang/String;"
	)
	String an(int var1, int[] var2) throws EOFException;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	String ai(int var1, int var2, int[] var3) throws EOFException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I"
	)
	int av(int var1, int var2, int var3);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[I)Ljava/lang/String;"
	)
	String aa(int var1, int var2, int[] var3) throws EOFException;
}
