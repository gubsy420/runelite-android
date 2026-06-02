import java.io.UnsupportedEncodingException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("vd")
public interface vd {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	vp az();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V"
	)
	static void bh(bc var0, int var1, int var2) {
		if (var0 == null) {
			var0.getClass();
		}

		var0.ag_fld += 378124001 * var1;
		var0.az_fld += 1334222094 * var2;
		var0.aw_fld += -340691061 * var1;
		var0.ay_fld += -1793572913 * var2;
		var0.an_fld = var0.an_fld + kj.aw(var1);
		var0.aa_fld = var0.aa_fld + kj.aw(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B"
	)
	byte[] ag(int var1) throws UnsupportedEncodingException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lvp;"
	)
	vp av();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;"
	)
	vp ak(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()[B"
	)
	byte[] ae() throws UnsupportedEncodingException;
}
