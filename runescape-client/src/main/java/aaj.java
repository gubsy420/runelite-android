import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("aaj")
public interface aaj {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	Object ay(int var1) throws EOFException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;"
	)
	Object az(int var1, int var2) throws EOFException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	Object as(int var1) throws EOFException;

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Los;)Lsl;"
	)
	static sl fp(os var0) {
		if (null == var0.ao_fld) {
			var0.ao_fld = pm.au(var0.ai_fld);
		}

		return var0.ao_fld;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Luv;I)Z"
	)
	static boolean ji(uv var0, int var1) {
		if (var0 == null) {
			var0.getClass();
		}

		return var0.aa_fld[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;"
	)
	Object ar(int var1) throws EOFException;
}
