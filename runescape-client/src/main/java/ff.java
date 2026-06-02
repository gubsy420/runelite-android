import java.awt.event.MouseEvent;
import java.io.EOFException;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ff")
public interface ff {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn au(lu var1) throws EOFException;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	fn ag(lu var1, int var2) throws EOFException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	fn az(lu var1, int var2) throws EOFException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;II)Lfn;"
	)
	fn av(lu var1, ol var2, int var3, int var4) throws EOFException;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn ab(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZI)Lfn;"
	)
	fn ah(lu var1, ol var2, int var3, boolean var4, int var5) throws EOFException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;II)Lfn;"
	)
	fn ae(lu var1, ol var2, int var3, int var4) throws EOFException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZI)Lfn;"
	)
	fn ay(lu var1, ol var2, int var3, boolean var4, int var5) throws EOFException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn as(lu var1) throws EOFException;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn ar(lu var1) throws EOFException;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn ad(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn al(lu var1) throws EOFException;

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	fn ai(lu var1, ol var2, int var3) throws EOFException;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn ax(lu var1) throws EOFException;

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lna;)Lvw;"
	)
	static vw lg(na var0) {
		if (var0 == null) {
			var0.getClass();
		}

		vw var1 = var0.ak_fld.hg_vw;
		if (var1 == var0.ak_fld) {
			var0.ag_fld = null;
			return null;
		} else {
			var0.ag_fld = var1.hg_vw;
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn an(lu var1) throws EOFException;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn aa(lu var1) throws EOFException;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	fn aq(lu var1, ol var2, int var3) throws EOFException;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llu;)Lfn;"
	)
	fn af(lu var1) throws EOFException;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;I)Lfn;"
	)
	fn am(lu var1, ol var2, int var3) throws EOFException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn at(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn ao(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)Lfn;"
	)
	fn ak(lu var1, int var2) throws EOFException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn ap(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn ac(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Ljava/awt/event/MouseEvent;)V"
	)
	static void ig(tj var0, MouseEvent var1) {
		if (var0 == null) {
			var0.getClass();
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZB)Lfn;"
	)
	fn aw(lu var1, ol var2, int var3, boolean var4, byte var5) throws EOFException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn aj(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn bm(lu var1, ol var2, int var3, boolean var4) throws EOFException;

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Luo;)Z"
	)
	static boolean po(uo var0) {
		return null == var0.ac_fld;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lol;IZ)Lfn;"
	)
	fn bd(lu var1, ol var2, int var3, boolean var4) throws EOFException;
}
