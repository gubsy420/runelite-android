import java.util.Collections;
import java.util.Comparator;
import net.runelite.api.annotations.ObfuscatedName;
import net.runelite.api.annotations.ObfuscatedSignature;

@ObfuscatedName("ja")
public interface ja {
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Ljava/util/Comparator;Z)V"
	)
	static void vu(nc var0, Comparator var1, boolean var2) {
		if (var0 == null) {
			var0.getClass();
		} else {
			if (var2) {
				Collections.sort(var0.ae_fld, var1);
			} else {
				Collections.sort(var0.ae_fld, Collections.reverseOrder(var1));
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	cn aq();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;"
	)
	fz ag(int var1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lde;"
	)
	de az(int var1);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;"
	)
	pi av(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lwl;"
	)
	wl ae(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	de al();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lcn;"
	)
	cn ah(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lfi;"
	)
	fi ay();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lfz;"
	)
	fz as();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	cn ad();

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lli;I)V"
	)
	static void cm(li var0, int var1) {
		var0.am_fld.ar(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lde;"
	)
	de af();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lwl;"
	)
	wl an();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lpi;"
	)
	pi au();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lpi;"
	)
	pi ax();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lfz;"
	)
	fz ar();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lwl;"
	)
	wl aa();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;"
	)
	fi ak(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "()Lfi;"
	)
	fi aw();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	cn ao();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	cn am();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lcn;"
	)
	cn ai();
}
