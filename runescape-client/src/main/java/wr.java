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

	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "(Lds;)Lpg;"
	)
	static pg si(ds var0) {
		return var0.af_fld;
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

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Ldf;)V"
	)
	static void fm(df var0) {
		var0.ak_fld.ag();
		var0.af_fld = 0;
	}

	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "(Luo;Llu;)Z"
	)
	static boolean vo(uo var0, lu var1) {
		if (var0 == null) {
			throw new NullPointerException();
		} else {
			return var0.ac_fld == var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;)V"
	)
	void ah(int var1, Object var2);
}
